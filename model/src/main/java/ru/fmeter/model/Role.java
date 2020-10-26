package ru.fmeter.model;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {
    private String name = "ADMIN";

    @Override
    public String getAuthority() {
        return name;
    }
}
