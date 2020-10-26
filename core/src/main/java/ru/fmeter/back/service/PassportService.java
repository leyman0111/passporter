package ru.fmeter.back.service;

import java.io.File;

public interface PassportService {
    File getPassport(String deviceType, String version, String serialNumber, String macAddress);
}
