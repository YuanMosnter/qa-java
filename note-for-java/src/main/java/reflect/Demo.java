package reflect;

public class Demo {
    public static void main(String[] args) {
        /**
         * 获取class的class实例的三种方式
         */
        //方式1、
        Class<String> stringClass = String.class;

        System.out.println(stringClass);

        //方式2、
        String hello = "hello";
        Class<? extends String> aClass = hello.getClass();
        System.out.println(aClass);

        //3、知道一个类的完整类名

        Class<?> aClass1 = null;
        try {
            aClass1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(aClass1);

        System.out.println(aClass1==aClass);



    }
}
