package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record: https://docs.oracle.com/en/java/javase/16/language/records.html
// Eliminate verbosity in create Java Beans
// Public acceson methods, constructor, equals, hashCode and toString
// are automatically generated
// Released in JDK 16

record Person(String name, int age) {
};

record Address(String street, String city, String state, String zip) {
};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "in28Minutes";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Javier", 60);
    }

    @Bean
    public Address address() {
        return new Address("1234 Main St", "Springfield", "IL", "62701");
    }
}
