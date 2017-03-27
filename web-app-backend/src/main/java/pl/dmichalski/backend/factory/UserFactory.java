package pl.dmichalski.backend.factory;

import org.springframework.stereotype.Component;
import pl.dmichalski.backend.model.UserData;
import pl.dmichalski.backend.domain.entity.User;

@Component
public class UserFactory implements Factory<UserData, User> {

    @Override
    public UserData create(User source) {
        return UserData.builder()
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .build();
    }

}
