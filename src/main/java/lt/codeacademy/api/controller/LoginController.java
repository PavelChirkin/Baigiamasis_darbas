package lt.codeacademy.api.controller;

import lt.codeacademy.api.dto.UserDto;
import lt.codeacademy.api.entity.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public UserDto login(@AuthenticationPrincipal User user) {
        return new UserDto(user);
    }
}