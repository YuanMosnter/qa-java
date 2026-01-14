package genericType;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hello");
        stringArrayList.add("world");
//       不需要强转
        String s = stringArrayList.get(0);

        //后面的类的类型可以省略
        ArrayList<String> list = new ArrayList<>();

        String[] ss = new String[] { "Orange", "Apple", "Pear" };

        Arrays.sort(ss);

        System.out.println(Arrays.toString(ss));

        Person[] ps = new Person[] {
                new Person("Bob", 61),
                new Person("Alice", 88),
                new Person("Lily", 75),
        };

        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }

}
class Person  implements Comparable<Person>{
    String name;
    int score;
    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return this.name + "," + this.score;
    }

    @Override
    public int compareTo(Person other) {
       return this.name.compareTo(other.name);
    }

}

