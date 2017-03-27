package pl.dmichalski.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.dmichalski.backend.domain.entity.User;
import pl.dmichalski.backend.domain.repository.UserRepository;
import pl.dmichalski.backend.factory.UserFactory;
import pl.dmichalski.backend.model.UserData;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserRepository userRepository;
    private final UserFactory userFactory;

    public List<UserData> findAll() {
        List<User> users = userRepository.findAll();
        return userFactory.createList(users);
    }

}
