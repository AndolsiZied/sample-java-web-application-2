package com.ando.samples.sjw.controller;

import com.ando.samples.sjw.service.WelcomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeController.class);

    @Autowired
    private WelcomeService welcomeService;

    @RequestMapping("/")
    public String index() {
        LOGGER.debug("Getting welcome model...");
        return welcomeService.message();
    }
}

