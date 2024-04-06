package com.wf.fx.fxol.fxol3.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class TemplateController {

    @Autowired
    Environment environment;

    @PostMapping("/createTemplate")
    public String createTemplate() {
        return "Template Created from IP: "+environment.getProperty("local.server.port");
    }

}
