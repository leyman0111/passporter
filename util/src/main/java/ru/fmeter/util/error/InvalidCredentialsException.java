package ru.fmeter.util.error;

import lombok.Getter;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Getter
public class InvalidCredentialsException extends UsernameNotFoundException {
    private final String localMessage;

    public InvalidCredentialsException(String message, String localMessage) {
        super(message);
        this.localMessage = localMessage;
    }
}
