package annotation;

import java.lang.annotation.*;

/**
 * 定义一个注解
 */
@Repeatable(Reports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
/**
 * 类或接口：ElementType.TYPE；
 * 字段：ElementType.FIELD；
 * 方法：ElementType.METHOD；
 * 构造方法：ElementType.CONSTRUCTOR；
 * 方法参数：ElementType.PARAMETER。
 */
public @interface Report {

    int type() default  0;
    String level() default "info";
    String value() default "";




}


