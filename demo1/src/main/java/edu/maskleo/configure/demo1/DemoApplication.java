package edu.maskleo.configure.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public TestBean createBean(){
        return new TestBean();
    }

    public static class TestBean {

        public String sayHi(){
            return "hi," + this.hashCode();
        }

    }

    @Bean({"test1", "test2"})
    public TestBean2 createBean2(){
        return new TestBean2();
    }

    public static class TestBean2 {

        public String sayHi(){
            return "hi," + this.hashCode();
        }

    }
}
