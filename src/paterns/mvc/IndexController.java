package paterns.mvc;

import java.util.*;

public class IndexController {
    IndexController() {
        Scanner sc = new Scanner(System.in);
        String option;
        System.out.println("==============================");
        Map<String, String> map = new HashMap<>();
        map.put("1", "Show Users");
        map.put("2", "Show Tasks");
        map.put("3", "Exit");
        for (Map.Entry<String, String> entry:
             map.entrySet()) {
            System.out.println(entry.getKey()+". "+entry.getValue());
        }

        System.out.println("pls choose a option");
        do {
            option = sc.next();
            if (map.get(option).equals("Exit")) {
                System.out.println("good bye!");
                System.exit(0);
            }
            if (map.containsKey(option)) {
                doAction(option);
                break;
            }
        } while (true);

    }

    private void doAction(String option) {
        if (option.equals("1")) {
            new ListController("users");
        }
        if (option.equals("2")) {
            new ListController("tasks");
        }
    }
}
