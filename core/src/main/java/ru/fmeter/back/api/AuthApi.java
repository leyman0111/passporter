package ru.fmeter.back.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.fmeter.back.service.AuthService;
import ru.fmeter.model.User;
import ru.fmeter.model.dto.AuthResponse;
import ru.fmeter.util.Path.AuthPath;


@RestController
public class AuthApi {
    private final AuthService service;

    public AuthApi(AuthService service) {
        this.service = service;
    }

    @PostMapping(path = AuthPath.LOGIN)
    public AuthResponse<String> signIn(@RequestBody User user) {
        return new AuthResponse<>(service.signIn(user.getUsername(), user.getPassword()));
    }

    @PostMapping(path = AuthPath.LOGOUT)
    public AuthResponse<String> signOut() {
        return new AuthResponse<>(service.signOut());
    }
}
