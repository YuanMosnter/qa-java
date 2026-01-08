package reflect;

public class HelloWord implements Hello{

    @Override
    public void morning(String name) {
        System.out.println("Good morning "+ name);
    }
}
