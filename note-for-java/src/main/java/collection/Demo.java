package collection;

import java.util.List;

public class Demo {


    public static void main(String[] args) {
        /*
         * 创建
         * list.of 创建不能传null
         */
        List<Integer> list = List.of(1, 2, 5);

        /*
         * 遍历
         */
        List<String> list1 = List.of("apple", "pear", "banana");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

}
