package genericType;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(123, 345);
        int i = add(p);
    }
    static int add(Pair<? extends Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        p.setFirst(null);
        p.setLast(null);
        return p.getFirst().intValue() + last.intValue();

        //查看Collection的一个方法
    }

//    int sumOfList(List<? extends Integer> list){
//        int sum = 0 ;
//        for (int i = 0; i < list.size(); i++) {
//            Integer n = list.get(i);
//            sum  = sum+n;
//        }
//        return  sum;
//    }
}
