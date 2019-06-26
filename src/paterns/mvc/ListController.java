package paterns.mvc;

import java.util.List;

public class ListController {
    ListController(String action) {
        if (action.equals("tasks")) {
            TasksModel model = new TasksModel();
            TasksView view = new TasksView();
            List<String> list = model.getData();
            view.render(list);
        }

        if (action.equals("users")) {
            UserModel model = new UserModel();
            UserView view = new UserView();
            List<String> list = model.getData();
            view.render(list);
        }
    }

}
