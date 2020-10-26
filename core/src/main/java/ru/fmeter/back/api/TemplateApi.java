package ru.fmeter.back.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.fmeter.back.service.TemplateService;
import ru.fmeter.model.Template;
import ru.fmeter.model.dto.TemplateResponse;
import ru.fmeter.util.Path.TemplatePath;

import java.io.File;
import java.util.List;

@RestController
public class TemplateApi {
    private final TemplateService service;

    public TemplateApi(TemplateService service) {
        this.service = service;
    }

    //возвращает список всех шаблонов со всеми версиями
    @GetMapping(path = TemplatePath.ALL)
    public TemplateResponse<List<Template>> getAll() {
        return new TemplateResponse<>(service.getAll());
    }

    //возвращает список всех версий определенного шаблона
    @GetMapping(path = TemplatePath.ALL + "/{deviceType}")
    public TemplateResponse<List<Template>> getAll(@PathVariable String deviceType) {
        return new TemplateResponse<>(service.getAll(deviceType));
    }

    //создает новую версию определенного шаблона и возвращает ссылку на генератор
    @PostMapping(path = TemplatePath.NEW + "/{deviceType}")
    public TemplateResponse<String> create(@PathVariable String deviceType, @RequestBody MultipartFile template) {
        return new TemplateResponse<>(service.create(deviceType, template));
    }

    //валидирует шаблон и возвращает сгенерированный паспорт с тестовыми данными
    @PostMapping(path = TemplatePath.VALIDATION + "/{deviceType}")
    public File validate(@PathVariable String deviceType, @RequestBody MultipartFile template) {
        return service.validate(deviceType, template);
    }

    //позволяет выгрузить шаблон
    @GetMapping(path = TemplatePath.MAIN + "/{id}")
    public File download(@PathVariable Long id) {
        return service.download(id);
    }

    //обновляет шаблон и возвращает данные о нем
    @PostMapping(path = TemplatePath.MAIN + "/{id}")
    public TemplateResponse<Template> update(@PathVariable Long id, @RequestBody MultipartFile template) {
        return new TemplateResponse<>(service.update(id, template));
    }

    //удаляет шаблон и возвращает результат
    @DeleteMapping(path = TemplatePath.MAIN + "/{id}")
    public TemplateResponse<String> delete(@PathVariable Long id, @RequestParam String key) {
        return new TemplateResponse<>(service.delete(id, key));
    }
}
