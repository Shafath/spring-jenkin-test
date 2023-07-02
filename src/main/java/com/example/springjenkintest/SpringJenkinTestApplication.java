package com.example.springjenkintest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinTestApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinTestApplication.class);

    public void init() {
        logger.info("init method");
    }

    public static void main(String[] args) {
        logger.info("main method");
        SpringApplication.run(SpringJenkinTestApplication.class, args);
    }

}
