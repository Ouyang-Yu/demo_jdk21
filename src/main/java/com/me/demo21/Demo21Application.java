package com.me.demo21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.AccessFlag;

@SpringBootApplication
public class Demo21Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo21Application.class, args);
        System.out.print("dsd");
        Class<UnknownError> unknownErrorClass = UnknownError.class;
        for (AccessFlag accessFlag : unknownErrorClass.accessFlags()) {
            accessFlag.locations()
        }


    }

}
