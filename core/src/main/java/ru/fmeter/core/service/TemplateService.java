package ru.fmeter.core.service;

import org.springframework.web.multipart.MultipartFile;
import ru.fmeter.model.Template;

import java.io.File;
import java.util.List;

public interface TemplateService {
    List<Template> getAll();

    List<Template> getAll(String deviceType);

    String create(String deviceType, MultipartFile template);

    File validate(String deviceType, MultipartFile template);

    File download(Long id);

    Template update(Long id, MultipartFile template);

    String delete(Long id, String key);
}
