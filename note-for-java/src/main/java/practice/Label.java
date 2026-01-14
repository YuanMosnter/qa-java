package practice;

import java.lang.annotation.*;
// 单体注解：标记字段的属性（比如标记为“敏感数据”或“核心字段”）
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Repeatable(Labels.class)
public @interface Label{
    String value() default "";
}