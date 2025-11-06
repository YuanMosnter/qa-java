package oop.string;

public class StringDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        sb.append(", tian").append(" love");
        System.out.println(sb);
    }
}
