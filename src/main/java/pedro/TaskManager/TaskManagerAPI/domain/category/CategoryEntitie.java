package pedro.TaskManager.TaskManagerAPI.domain.category;

import pedro.TaskManager.TaskManagerAPI.domain.base.BaseEntitie;

import java.util.Date;

public class CategoryEntitie extends BaseEntitie implements CategoryInterface {
    public CategoryEntitie(String id, String name, String description, Date createAt, Date updateAt, Date deactivateAt) {
        super(id, name, description, createAt, updateAt, deactivateAt);
    }
}
