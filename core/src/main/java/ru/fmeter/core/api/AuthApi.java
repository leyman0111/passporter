package ru.fmeter.core.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fmeter.core.service.AuthService;
import ru.fmeter.model.dto.AuthResponse;
import ru.fmeter.util.Path.AuthPath;


@RestController
public class AuthApi {
    private final AuthService service;

    public AuthApi(AuthService service) {
        this.service = service;
    }

    @PostMapping(path = AuthPath.LOGIN)
    public AuthResponse<String> signIn(String login, String password) {
        return new AuthResponse<>(service.signIn(login, password));
    }

    @PostMapping(path = AuthPath.LOGOUT)
    public AuthResponse<String> signOut() {
        return new AuthResponse<>(service.signOut());
    }
}
