package exection;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        String token = login("admin", "passw");
        System.out.println("Token: " + token);
    }

    static String login(String username, String password) {
        if (username.equals("admin")) {
            if (password.equals("pass")) {
                return "xxxxxx";
            } else {
                // 抛出LoginFailedException:
                throw new LoginFailedException("Bad username or password.");
            }
        } else {
            // 抛出UserNotFoundException:
            throw new UserNotFoundException("User not found.");
        }
    }
}
