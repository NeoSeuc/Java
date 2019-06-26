package paterns.mvc;

import java.util.List;

public class UserView {
    public void render(List<String> list) {
        System.out.println("User Table:");
        for (String i:
                list) {
            System.out.println(i);
        }
    }
}
