package ru.fmeter.back.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.fmeter.model.User;
import ru.fmeter.util.error.InvalidCredentialsException;

@Service
public class AuthServiceImpl implements AuthService {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String signIn(String login, String password) {
        User user = userService.loadUserByUsername(login);
        if (!passwordEncoder.matches(user.getPassword(), password))
            throw new InvalidCredentialsException("Invalid username or password", "Неверный логин или пароль");
        return "OK";
    }

    @Override
    public String signOut() {
        return null;
    }
}
