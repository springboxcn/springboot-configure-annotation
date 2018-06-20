package edu.maskleo.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RefreshScope
public class TestController {

    @Autowired
    private Teacher teacher;

    @Value("${student-list.tom.name}")
    private String name;

    @GetMapping("test")
    public ResponseEntity<String> test() {
        System.out.println("============================");
        System.out.println(String.format("name:%s", name));
        return ResponseEntity.ok(teacher.toString());
    }

}
