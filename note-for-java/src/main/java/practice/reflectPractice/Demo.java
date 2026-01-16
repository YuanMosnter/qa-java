package practice.reflectPractice;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class Demo {

    public void recursiveExtract(Object obj) {
        //如果对象空的话直接返回null
        if (obj == null) return;
        // 如果是map对象，遍历map得到字段
        if (obj instanceof Map<?, ?>) {

            for (Object value : ((Map<?, ?>) obj).values()) {
                recursiveExtract(value);
            }
        }

        // 2. 处理 List：它也是容器，也要钻进去
        else if (obj instanceof List<?>) {
            for (Object item : (List) obj) {
                recursiveExtract(item);
            }

        }
        // 3. 最终落点：普通对象（比如你的 Order 或 User）
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (field.isAnnotationPresent(Extract.class)) {
                    System.out.println("提取成功: " + field.getName() + " = " + field.get(obj));
                } else {
                    // 如果这个字段本身又是另一个复杂对象，继续钻
                    recursiveExtract(field.get(obj));
                    Object fieldVal = field.get(obj);
                    if (fieldVal != null && !field.getType().getName().startsWith("java.lang")) {
                        //deepScan(fieldVal);
                    }
                }

            }catch (Exception e){
                //sout
                System.out.println(e);
            }
            }

        }
    }
