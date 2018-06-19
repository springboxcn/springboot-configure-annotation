
## `@Bean`

```java
@Bean
public TestBean createBean(){
    return new TestBean();
}
```

注入 `Bean` 到 `Spring` 容器.

```java
@Bean({"test1", "test2"})
public TestBean2 createBean2(){
    return new TestBean2();
}
```

给注入的 `Bean` 添加别名