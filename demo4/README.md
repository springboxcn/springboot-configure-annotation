`/actuator/refresh`

https://stackoverflow.com/questions/49311068/refreshscope-and-refresh-not-working

原始的类必须都有注解 `@RefreshScope`

引用该类的地方有 `@RefreshScope` 才会刷新 `@Value` 注入的值

