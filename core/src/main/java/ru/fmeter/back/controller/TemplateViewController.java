package ru.fmeter.back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.fmeter.util.Path.TemplatePath;

@Controller
public class TemplateViewController {
    @GetMapping(path = TemplatePath.MAIN)
    public String getTemplatesView() {
        return null;
    }
}
