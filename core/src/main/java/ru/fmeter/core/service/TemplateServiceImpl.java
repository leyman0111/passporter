package ru.fmeter.core.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.fmeter.model.Template;

import java.io.File;
import java.util.List;

@Service
public class TemplateServiceImpl implements TemplateService {
    @Override
    public List<Template> getAll() {
        return null;
    }

    @Override
    public List<Template> getAll(String deviceType) {
        return null;
    }

    @Override
    public String create(String deviceType, MultipartFile template) {
        return null;
    }

    @Override
    public File validate(String deviceType, MultipartFile template) {
        return null;
    }

    @Override
    public File download(Long id) {
        return null;
    }

    @Override
    public Template update(Long id, MultipartFile template) {
        return null;
    }

    @Override
    public String delete(Long id, String key) {
        return null;
    }
}
