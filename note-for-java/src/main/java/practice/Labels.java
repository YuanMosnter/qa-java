package practice;

import java.lang.annotation.*;

//容器注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Labels {
    Label[] value();
}

