package com.epam.statistic_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
//@EnableJms
public class StatisticAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatisticAppApplication.class, args);
    }
}
