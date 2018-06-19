package edu.maskleo.configure.demo2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class Teacher {

    @Autowired
    private Environment env;

    @Bean
    public Student getJack() {
        return env.getProperty("student.jack",Student.class);
    }

    @Bean
    public Student getMarry() {
        return env.getProperty("student.marry",Student.class);
    }

    @Bean
    public Student getTom() {
        return env.getProperty("student.tom",Student.class);
    }

}
