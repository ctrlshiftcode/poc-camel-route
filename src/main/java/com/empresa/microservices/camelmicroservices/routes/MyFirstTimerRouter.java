package com.empresa.microservices.camelmicroservices.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyFirstTimerRouter extends RouteBuilder {

    @Autowired
    private GetCurrentTimeBean getCurrentTimeBean;

    @Override
    public void configure() throws Exception {
//
//        from("timer:timer01?period=3000")
//                .to("log: Log timer 01");
//
//        from("timer:timer02")
//                .transform().constant("Timer02: " + LocalDateTime.now())
//                .to("log: Log timer 02");
//
//        from("timer:timer03")
////               Chamada inplicita da Classe e método
//                .bean("getCurrentTimeBean")
//                .to("log:Log  do timer 03");

//        from("timer:timer04")
////               Chamada mais correta, por utilizar o bean como autowired
//                .bean(getCurrentTimeBean)
//                .log("${body}")
//                .to("log:Log  do timer 04");

        //Camel irá criar automaticamente os diretorios
        from("file:files/input")
                .log("${body}")
                .to("file:files/output");





    }


}

@Component
class GetCurrentTimeBean {
    public String getCurrentTime(){
        return "Time is GeCurrentimeBean Class, getCurrentTime method:" + LocalDateTime.now();
    }

}