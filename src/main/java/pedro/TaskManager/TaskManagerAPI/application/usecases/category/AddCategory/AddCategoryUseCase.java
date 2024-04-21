package pedro.TaskManager.TaskManagerAPI.application.usecases.category.AddCategory;

import pedro.TaskManager.TaskManagerAPI.domain.base.BaseUseCaseInterface;
import pedro.TaskManager.TaskManagerAPI.domain.category.CategoryEntitie;
import pedro.TaskManager.TaskManagerAPI.domain.category.CategoryRepositoryInterface;

public class AddCategoryUseCase implements BaseUseCaseInterface<AddCategoryInputDTO, AddCategoryOutputDTO> {
    private CategoryRepositoryInterface categoryRepository;

    public AddCategoryUseCase(CategoryRepositoryInterface categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public AddCategoryOutputDTO execute(AddCategoryInputDTO input) {
        CategoryEntitie newCategory = new CategoryEntitie(input.getName(), input.getDescription());
        categoryRepository.add(newCategory);
        return new AddCategoryOutputDTO(newCategory);
    }
}
