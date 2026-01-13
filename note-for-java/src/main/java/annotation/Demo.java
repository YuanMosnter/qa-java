package annotation;

import reflect.Person;

import java.lang.reflect.Field;


public class Demo {
    public static void main(String[] args) {

        Class <?> tempclass = Person.class;
        Field[] fields = tempclass.getDeclaredFields();
        for (Field field : fields) {

            System.out.println(field);
        }
        tempclass = tempclass.getSuperclass();
        System.out.println(tempclass);
        boolean annotation = Person.class.isAnnotationPresent(Report.class);


        System.out.println(annotation);

    }
}
