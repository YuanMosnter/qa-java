package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Person> personClass = Person.class;

        System.out.println(personClass);

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println();

        Person zhangsan = new Person("zhangsan", 11);

        Class<? extends Person> aClass = zhangsan.getClass();

        Field name = null;
        try {
            //1、创建实例。2、根据实例获取类。3、根据实例获取指定的字段。4、设置字段不管是不是private据可以访问5、获取实例对象的具体名称字段
            name = aClass.getDeclaredField("name");
            System.out.println(name);
            name.setAccessible(true);
            name.set(zhangsan, "Xiao Hong");
            Object o = name.get(zhangsan);
            System.out.println(o);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        //点用构造方法
        Constructor<Integer> constructor = Integer.class.getConstructor(int.class);
        Integer i = (Integer)constructor.newInstance(123);
        System.out.println(i);

        //获取构造方法


    }
}
