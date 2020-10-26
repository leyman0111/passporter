package ru.fmeter.back.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.fmeter.model.User;
import ru.fmeter.util.error.InvalidCredentialsException;

@Component
public class UserService implements UserDetailsService {
    @Value("${spring.security.user.name}")
    private String username;
    @Value("${spring.security.user.password")
    private String password;

    @Override
    public User loadUserByUsername(String s) throws UsernameNotFoundException {
        if (s.equals(username)) return new User(username, password, null);
        throw new InvalidCredentialsException("Invalid username or password",
                "Неверный логин или пароль");
    }
}
