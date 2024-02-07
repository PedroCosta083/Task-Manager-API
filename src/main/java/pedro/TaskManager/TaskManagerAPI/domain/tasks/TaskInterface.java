package pedro.TaskManager.TaskManagerAPI.domain.tasks;

import pedro.TaskManager.TaskManagerAPI.domain.category.CategoryEntitie;
import pedro.TaskManager.TaskManagerAPI.domain.users.UsersEntitie;

import java.util.Date;

public interface TaskInterface {
    CategoryEntitie getCategory();
    String getStatus();
    Date getDueDate();
    String getPriority();
    UsersEntitie getResponsible();
    void validate();
}
