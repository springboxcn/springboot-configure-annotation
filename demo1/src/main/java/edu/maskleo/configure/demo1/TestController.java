package edu.maskleo.configure.demo1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("test")
    public ResponseEntity<String> test(){
        DemoApplication.TestBean tb = SpringApplicationContextUtil.getBean(DemoApplication.TestBean.class);
        return ResponseEntity.ok(tb.sayHi());
    }

    @GetMapping("test2")
    public ResponseEntity<String> test2(){
        DemoApplication.TestBean t1 = (DemoApplication.TestBean)SpringApplicationContextUtil.getApplicationContext().getBean("test1");
        DemoApplication.TestBean t2 = (DemoApplication.TestBean)SpringApplicationContextUtil.getApplicationContext().getBean("test2");
        return ResponseEntity.ok(String.format("test1 eq test2:%s",Objects.equals(t1,t2)));
    }

}
