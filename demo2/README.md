
## `@ConfigurationProperties`

```java
@Component
@ConfigurationProperties(prefix = "student")
public class Teacher {

    private Student jack;

    private Student marry;

    private Student tom;

    // git and set 
}
```

```java
public class Student {

    private String name;

    private int sex;

    private boolean isOk;

    // git and set
}
```

```yml
student:
  jack:
    name: jack
    sex: 1
    isOk: true
  marry:
    name: marry
    sex: 0
    isOk: true
  tom:
    name: tom
    sex: 1
    isOk: false
```

通过 `Environment` 获取配置信息 

https://stackoverflow.com/questions/23134869/spring-boot-how-to-use-multiple-yml-files

https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html

https://stackoverflow.com/questions/39198766/how-to-define-complex-list-for-application-yml-in-spring-boot

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config-vs-value