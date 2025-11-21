package reflect;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student> studentClass = Student.class;
        //获取score字段
        System.out.println(studentClass.getField("score"));

        System.out.println(studentClass.getField("name"));

        System.out.println(studentClass.getDeclaredField("grade"));

    }
}
class Student extends Person {
    public int score;
    private int grade;
}

class Person {
    public String name;
}