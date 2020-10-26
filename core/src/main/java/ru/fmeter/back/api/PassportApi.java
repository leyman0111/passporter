package ru.fmeter.back.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.fmeter.back.service.PassportService;
import ru.fmeter.back.service.PassportServiceImpl;
import ru.fmeter.util.Path;

import java.io.File;

@RestController
public class PassportApi {
    private final PassportService service;

    public PassportApi(PassportServiceImpl service) {
        this.service = service;
    }

    @GetMapping(path = Path.MANUAL + "/{deviceType}/{version}")
    public File get(@PathVariable String deviceType, @PathVariable String version, @RequestParam String serialNumber,
                    @RequestParam(required = false) String macAddress) {
        return service.getPassport(deviceType, version, serialNumber, macAddress);
    }
}
