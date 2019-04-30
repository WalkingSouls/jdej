package com.miquankj.jdej.deploy;

import com.miquankj.jdej.common.yaml.YamlProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan
@SpringBootApplication
public class Application implements CommandLineRunner {
    
    
    @Override
    public void run(String... args) {
        System.out.println();
        System.out.println("===================================================");
        System.out.println("---------------------------------------------------");
        System.out.println("Current project name : " + YamlProperties.getProperty("spring.application.name"));
        System.out.println("---------------------------------------------------");
        System.out.println("===================================================");
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        SpringApplication.run(Application.class, args);
    }
}
