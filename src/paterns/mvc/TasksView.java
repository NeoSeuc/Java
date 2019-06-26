package paterns.mvc;

import java.util.List;

public class TasksView {
    public void render(List<String> list) {
        System.out.println("Tasks list:");
        for (String i:
             list) {
            System.out.println(i);
        }
    }
}
