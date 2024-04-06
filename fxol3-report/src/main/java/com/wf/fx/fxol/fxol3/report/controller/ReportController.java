package com.wf.fx.fxol.fxol3.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    Environment environment;

    @PostMapping("/getReport")
    public String getReport() {
        return "Report Delivered from IP: "+environment.getProperty("local.server.port");
    }

}
