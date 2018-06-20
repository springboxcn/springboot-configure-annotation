package edu.maskleo.demo4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "student-list")
@Getter
@Setter
@ToString
@RefreshScope
public class Teacher {

    private Student jack;

    private Student marry;

    private Student tom;

    @Getter
    @Setter
    @ToString
    public static class Student {

        private String name;

        private int sex;

        private boolean isOk;

    }

}
