package pedro.TaskManager.TaskManagerAPI.domain.tasks;

import pedro.TaskManager.TaskManagerAPI.domain.base.Base_Entitie;
import pedro.TaskManager.TaskManagerAPI.domain.users.Users_Entitie;

import java.util.Date;

public class Task_Entitie extends Base_Entitie {

    private String category;
    private String status;
    private Date due_date;
    private String priority;
    private Users_Entitie responsible;


    public Task_Entitie(String id, String name, String description, String createAt, String updateAt, String deactivateAt, String category, String status, Date due_date, String priority, Users_Entitie responsible) {
        super(id, name, description, createAt, updateAt, deactivateAt);
        this.category = category;
        this.status = status;
        this.due_date = due_date;
        this.priority = priority;
        this.responsible = responsible;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Users_Entitie getResponsible() {
        return responsible;
    }

    public void setResponsible(Users_Entitie responsible) {
        this.responsible = responsible;
    }
}
