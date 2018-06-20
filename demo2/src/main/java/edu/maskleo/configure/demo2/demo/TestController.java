package edu.maskleo.configure.demo2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private Teacher teacher;

    @Autowired
    private Environment environment;

    @GetMapping("test")
    public ResponseEntity<String> test(){
        //Student student = environment.getProperty("student.jack", Student.class);
        System.out.println(environment.getProperty("student.jack.name"));
        BindResult<Student> student = Binder.get(environment).bind("student.jack" ,Student.class);
        System.out.println(String.format("key:student.jack,value:%s",student.get()));
        return ResponseEntity.ok(String.format("jack:%s,marry:%s,tom:%s",teacher.getJack(),teacher.getMarry(),teacher.getTom()));
    }

}
