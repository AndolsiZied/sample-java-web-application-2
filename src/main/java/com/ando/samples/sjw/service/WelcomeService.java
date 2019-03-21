package com.ando.samples.sjw.service;

import com.ando.samples.sjw.util.Constants;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String message() {
        return Constants.WELCOME_MSG;
    }
}
