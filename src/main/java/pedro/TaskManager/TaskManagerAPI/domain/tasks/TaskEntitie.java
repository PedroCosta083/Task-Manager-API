package pedro.TaskManager.TaskManagerAPI.domain.tasks;

import pedro.TaskManager.TaskManagerAPI.domain.base.BaseEntitie;
import pedro.TaskManager.TaskManagerAPI.domain.category.CategoryEntitie;
import pedro.TaskManager.TaskManagerAPI.domain.users.UsersEntitie;

import java.util.Date;

public class TaskEntitie extends BaseEntitie implements TaskInterface{

    private CategoryEntitie category;
    private String status;
    private Date dueDate;
    private String priority;
    private UsersEntitie responsible;


    public TaskEntitie(String id, String name, String description, Date createAt, Date updateAt, Date deactivateAt, CategoryEntitie category, String status, Date dueDate, String priority, UsersEntitie responsible) {
        super(id, name, description, createAt, updateAt, deactivateAt);
        this.category = category;
        this.status = status;
        this.dueDate = dueDate;
        this.priority = priority;
        this.responsible = responsible;
        validate();
    }

    public CategoryEntitie getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public UsersEntitie getResponsible() {
        return responsible;
    }

    @Override
    public void validate() {
        super.validate(); // Chama o método validate() da classe BaseEntitie

        // Validação específica para TaskEntitie
        if (category == null) {
            throw new IllegalArgumentException("Category is required");
        }

        if (status == null || status.isEmpty()) {
            throw new IllegalArgumentException("Status is required");
        }

        if (dueDate == null) {
            throw new IllegalArgumentException("Due date is required");
        }

        if (priority == null || priority.isEmpty()) {
            throw new IllegalArgumentException("Priority is required");
        }

        if (responsible == null) {
            throw new IllegalArgumentException("Responsible is required");
        }

        if (dueDate.before(getCreateAt())) {
            throw new IllegalArgumentException("Due date cannot be before creation date");
        }

        if (dueDate.after(getDeactivateAt())) {
            throw new IllegalArgumentException("Due date cannot be after deactivation date");
        }
    }
}
