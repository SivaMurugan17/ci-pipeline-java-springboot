package com.siva.ci_pipeline_java_springboot.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GreetControllerTest {
    @InjectMocks
    GreetController greetController;

    @Test
    public void testGreet(){
        String greeting = greetController.greet();
        Assertions.assertEquals("Hiya, how it's going?",greeting);
    }
}
