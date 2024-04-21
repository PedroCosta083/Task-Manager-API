package pedro.TaskManager.TaskManagerAPI.application.usecases.category.AddCategory;

public class AddCategoryInputDTO {
    private String name;
    private String Description;

    public AddCategoryInputDTO(String name, String description) {
        this.name = name;
        Description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

