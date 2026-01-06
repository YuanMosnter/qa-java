package reflect;

public class Teacher extends Person{
    private String sex;


    public Teacher(String name, int age, String sex) {
        super(name, age);
        this.sex = sex;
    }

    public Teacher(String sex) {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
