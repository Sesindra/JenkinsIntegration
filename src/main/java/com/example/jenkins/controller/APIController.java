package com.example.jenkins.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
 private static Logger logger = LoggerFactory.getLogger(APIController.class);
    @GetMapping("/call")
    public String call(){
        logger.info("Jenkins project is getting called");
        logger.info("Jenkins Testing the automated pipeline");
        return "Jenkins project API's are getting called ";

    }
}
