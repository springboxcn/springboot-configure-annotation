package edu.maskleo.configure.demo2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private Teacher teacher;

    @GetMapping("test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok(String.format("jack:%s,marry:%s,tom:%s",teacher.getJack(),teacher.getMarry(),teacher.getTom()));
    }

}
