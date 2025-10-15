package com.intellidocs.scanner.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Marks this class as a source of bean definitions
public class IntelliDocsAutoConfiguration {

    @Bean // This annotation tells Spring to create a CommandLineRunner bean
    public CommandLineRunner testRunner() {
        return args -> {
            // This is the code that will run inside the test application
            System.out.println("======================================================");
            System.out.println("SUCCESS: The IntelliDocs Scanner Library is working!");
            System.out.println("======================================================");
        };
    }
}
