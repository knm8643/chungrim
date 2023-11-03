package com.tsib.chungrim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ChungrimApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChungrimApplication.class, args);
    }

}
