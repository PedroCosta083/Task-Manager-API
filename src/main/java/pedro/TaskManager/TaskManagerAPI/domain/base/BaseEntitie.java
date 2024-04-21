package pedro.TaskManager.TaskManagerAPI.domain.base;

import java.util.Date;

public class BaseEntitie implements BaseInterface{
    private String id ;
    private String name;
    private String description;
    private Date createAt;
    private Date updateAt;
    private Date deactivateAt;

    public BaseEntitie(String id, String name, String description, Date createAt, Date updateAt, Date deactivateAt)  {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.deactivateAt = deactivateAt;
        validate();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public Date getDeactivateAt() {
        return deactivateAt;
    }

    @Override
    public void validate() {

        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID is required");
        }

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is required");
        }

        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description is required");
        }


        if (createAt == null) {
            throw new IllegalArgumentException("CreateAt date cannot be null");
        }

        if (updateAt == null) {
            throw new IllegalArgumentException("UpdateAt date cannot be null");
        }

        if (deactivateAt == null) {
            throw new IllegalArgumentException("DeactivateAt date cannot be null");
        }

        if (deactivateAt.before(createAt)) {
            throw new IllegalArgumentException("DeactivateAt date cannot be before CreateAt date");
        }

        if (deactivateAt.before(updateAt)) {
            throw new IllegalArgumentException("DeactivateAt date cannot be before UpdateAt date");
        }
    }
}
