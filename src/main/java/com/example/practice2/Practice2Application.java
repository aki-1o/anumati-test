package com.example.practice2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class Practice2Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice2Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.print("Beans my spring boot: ");

            String[] beansNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beansNames);
            for (String bn: beansNames) {
                System.out.print(bn);
            }
        };
    }
}
