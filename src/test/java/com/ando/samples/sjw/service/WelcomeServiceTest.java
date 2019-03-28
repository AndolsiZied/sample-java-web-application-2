package com.ando.samples.sjw.service;

import com.ando.samples.sjw.config.ServiceConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.ando.samples.sjw.util.Constants.WELCOME_MSG;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ServiceConfiguration.class)
public class WelcomeServiceTest {

    @Autowired
    private WelcomeService welcomeService;

    @Test
    public void testMessage() throws Exception {
        assertThat(welcomeService.message(), is(equalTo(WELCOME_MSG)));
    }
    
    @Test
    public void testFail() throws Exception {
        // fail("must fail");
    }
}
