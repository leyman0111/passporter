package ru.fmeter.back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.fmeter.util.Path.AuthPath;

@Controller
public class AuthViewController {
    @GetMapping(path = AuthPath.LOGIN)
    public String getAuthView() {
        return null;
    }
}
