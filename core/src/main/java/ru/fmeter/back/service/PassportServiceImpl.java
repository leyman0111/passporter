package ru.fmeter.back.service;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class PassportServiceImpl implements PassportService {
    public File getPassport(String deviceType, String version, String serialNumber, String macAddress) {
        return null;
    }
}
