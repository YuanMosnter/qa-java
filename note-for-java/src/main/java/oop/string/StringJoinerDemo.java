package oop.string;

public class StringJoinerDemo {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ");
        for (String name : names) {
            stringBuilder.append(name).append(",");
        }
        //去掉最后的，
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        stringBuilder.append("!");
        System.out.println(stringBuilder.toString());
    }
}
