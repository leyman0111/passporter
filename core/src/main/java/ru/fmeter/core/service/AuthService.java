package ru.fmeter.core.service;

public interface AuthService {
    String signIn(String login, String password);

    String signOut();
}
