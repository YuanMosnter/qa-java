package practice.reflectPractice;

public class MainApp {
    public static void main(String[] args) {
        User u1 = new User("001", "13800001111");
        System.out.println(DataInspector.inspect(u1));

        // 情况 B：核心字段缺失
        User u2 = new User(null, "13911112222");
        System.out.println(DataInspector.inspect(u2));
    }
}
