package com.solt9029.springboottutorial;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class HelloAspects {
    @Before("within(com.solt9029.springboottutorial.services.*)")
    public void beforeServiceHandler() {
        log.info("before service method");
    }
}
