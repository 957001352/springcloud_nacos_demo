package com.gchen.demo_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableZuulProxy
@SpringBootApplication
public class DemoZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoZuulApplication.class,args);
    }
}
