package com.example.springjenkintest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinTestApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinTestApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("test method");
        logger.info("test method 2");
        Assert.assertEquals(true, true);
    }

}
