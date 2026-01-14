package practice;

import java.lang.reflect.Field;

public class DataInspector {
    public static <T> CheckResult<T> inspect(T obj) {
        Class<?> tempClass = obj.getClass();
        //获取类的全部字段
        Field[] fields = tempClass.getDeclaredFields();

        StringBuilder sb = new StringBuilder();
        try{
        for (Field field : fields) {
            //打破private 限制
            field.setAccessible(true);
            Object value = field.get(obj);
            //1、处理重复注解label
            Label[] labels = field.getAnnotationsByType(Label.class);
            if (labels.length > 0) {
                sb.append("字段 [").append(field.getName()).append("] 的标签有: ");
                for (Label label : labels) {
                    sb.append(label.value()).append(" ");

                }
                sb.append("\n");
            }
            if (field.isAnnotationPresent(MustCheck.class)) {
                if (value == null ||value.toString().isEmpty()) {
                    return new CheckResult<>("失败", "核心字段 [" + field.getName() + "] 为空！", obj);
                }
            }
        }
        }catch (Exception e){
            return new CheckResult<>("异常", e.getMessage(), obj);
        }
        return new CheckResult<>("成功", sb.toString() + "所有字段校验通过。", obj);
    }
}
