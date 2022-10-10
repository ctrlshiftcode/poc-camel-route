package com.empresa.microservices.camelmicroservices.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFirstTimerRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        System.out.println("asdsadasdas");

        from("timer:first-timer").to("log:first-timer");
    }
}
