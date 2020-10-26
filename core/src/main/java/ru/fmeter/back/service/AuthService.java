package ru.fmeter.back.service;

public interface AuthService {
    String signIn(String login, String password);

    String signOut();
}
