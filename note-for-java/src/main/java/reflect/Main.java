package reflect;

import java.lang.reflect.*;

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

        // 大多数调用
        HelloWord helloWord = new HelloWord();
        helloWord.morning("Bob");

        // 动态代理
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println(method);
                if (method.getName().equals("morning")){
                    System.out.println("Good Morning" +args[0]);
                }else if ( method.getName().equals("fly")){
                   {
                        System.out.println(args[0] +" is flying " );
                    }
                }
                return null;
            }
        };

        Flyable fly = (Flyable)Proxy.newProxyInstance(Hello.class.getClassLoader(),// 家在classLoader
                new Class[]{Hello.class,Flyable.class}, invocationHandler
        );

        fly.fly(" bird");

    }
    interface  Flyable{
        void fly(String name);
    }
}
