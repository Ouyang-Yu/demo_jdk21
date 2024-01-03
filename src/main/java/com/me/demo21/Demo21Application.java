package com.me.demo21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.redis.outbound.ExpressionArgumentsStrategy;

import java.lang.reflect.AccessFlag;
import java.util.Collection;

@SpringBootApplication
public class Demo21Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo21Application.class, args);
        System.out.print("dsd");
        Class<UnknownError> unknownErrorClass = UnknownError.class;
        for (AccessFlag accessFlag : unknownErrorClass.accessFlags()) {
            for (AccessFlag.Location location : accessFlag.locations()) {
                System.out.println(location);
            }
        }
        UnknownError.class.accessFlags()
                .stream()
                .map(AccessFlag::locations)
                .flatMap(Collection::stream)
                .forEach(System.out::println);

    }

}
