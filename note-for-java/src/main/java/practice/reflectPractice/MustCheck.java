package practice.reflectPractice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 约束注解：标记该字段是否必须进行非空检查
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MustCheck {

}
