package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1: Launch a Spring Context (application context)
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure the things that we want Spring to manage for us
        // HelloWorldConfiguration @Configuration
        // name() @Bean

        // 3: Get the beans from the context
        var name = context.getBean("name");
        System.out.println(name);
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
    }
}
