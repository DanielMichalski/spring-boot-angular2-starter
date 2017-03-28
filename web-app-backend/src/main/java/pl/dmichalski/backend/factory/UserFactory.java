package pl.dmichalski.backend.factory;

import org.springframework.stereotype.Component;
import pl.dmichalski.backend.domain.entity.Role;
import pl.dmichalski.backend.domain.entity.User;
import pl.dmichalski.backend.model.UserData;

import java.util.Set;

import static java.util.stream.Collectors.toSet;

@Component
public class UserFactory implements Factory<UserData, User> {

    @Override
    public UserData create(User source) {
        return UserData.builder()
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .roles(mapRoles(source.getUserRoles()))
                .build();
    }

    private Set<String> mapRoles(Set<Role> userRoles) {
        return userRoles.stream()
                .map(Role::getName)
                .collect(toSet());
    }

}
