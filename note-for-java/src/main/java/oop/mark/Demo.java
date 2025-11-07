package oop.mark;

public class Demo {
    public static void main(String[] args) {
        Weekday day = Weekday.SAT;
        if (day.isWeekday()){
            System.out.println("在家睡觉");
        }else {
            System.out.println("需要上班");
        }
    }
}
