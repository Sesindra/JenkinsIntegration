package com.example.jenkins.controller;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;


public class APIControllerTest {
    private static Logger logger = LoggerFactory.getLogger(APIController.class);

    @Test
    public void callTest(){
        logger.info("Jenkins test files are getting called");
        assertEquals(true , true);
    }
}
