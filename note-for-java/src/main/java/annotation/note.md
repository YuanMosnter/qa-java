# 使用注解
```

```

# 元注解
- @Retention
  - 仅编译期：RetentionPolicy.SOURCE； 类型的注解在编译期就被丢掉了；
  - 仅class文件：RetentionPolicy.CLASS； 仅保存在class文件中，它们不会被加载进JVM；
  - 运行期：RetentionPolicy.RUNTIME。RUNTIME类型的注解会被加载进JVM，并且在运行期可以被程序读取。

- @Target
  - 类或接口：ElementType.TYPE； 
  - 字段：ElementType.FIELD； 
  - 方法：ElementType.METHOD； 
  - 构造方法：ElementType.CONSTRUCTOR； 
  - 方法参数：ElementType.PARAMETER。
- @Repeatable
  这个元注解可以定义Annotation是否可重复。这个注解应用不是特别广泛。
```java
  Repeatable(Reports.class)
  @Target(ElementType.TYPE)
  public @interface Report {
      int type() default 0;
      String level() default "info";
      String value() default "";
  }
  
  @Target(ElementType.TYPE)
  public @interface Reports {
      Report[] value();
  }
  
  
  ```

- @Inherited
定义子类是否可以继承父类定义的注解 。@Inherited仅针对@Target(ElementType.TYPE)类型的annotation有效，并且仅针对class的继承，对interface的继承无效
  

