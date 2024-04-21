package pedro.TaskManager.TaskManagerAPI.domain.category;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface CategoryRepositoryInterface {
    void add(CategoryEntitie category);
    void update(CategoryEntitie category);
    void activate(String categoryId);
    CompletableFuture<Void> deactivate(String categoryId);
    CompletableFuture<CategoryEntitie> findById(String categoryId);
    CompletableFuture<List<CategoryEntitie>> findAll();
}
