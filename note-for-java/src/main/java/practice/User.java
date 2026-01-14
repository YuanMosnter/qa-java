package practice;

public class User {
    @Label("核型")@Label("唯一注解")
    @MustCheck
    private String id;
    @Label("脱敏")
    private String phoneNumber;
    public User(String id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{id='" + id + "', phone='" + phoneNumber + "'}";
    }

}

