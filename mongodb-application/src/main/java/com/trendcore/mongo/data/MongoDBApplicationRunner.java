package com.trendcore.mongo.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDBApplicationRunner {

    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("---------------------------------------");
        SpringApplication.run(MongoDBApplicationRunner.class,args);
    }

}
