package edu.maskleo.configure.demo2.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "student")
public class Teacher {

    private Student jack;

    private Student marry;

    private Student tom;

    public Student getJack() {
        return jack;
    }

    public void setJack(Student jack) {
        this.jack = jack;
    }

    public Student getMarry() {
        return marry;
    }

    public void setMarry(Student marry) {
        this.marry = marry;
    }

    public Student getTom() {
        return tom;
    }

    public void setTom(Student tom) {
        this.tom = tom;
    }
}
