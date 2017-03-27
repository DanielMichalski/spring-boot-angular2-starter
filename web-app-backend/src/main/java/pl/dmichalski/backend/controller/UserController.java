package pl.dmichalski.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dmichalski.backend.domain.entity.User;
import pl.dmichalski.backend.model.UserData;
import pl.dmichalski.backend.service.UserService;

import java.util.List;

@RestController("users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserData> findAll() {
        return userService.findAll();
    }

}
