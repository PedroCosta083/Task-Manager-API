package pedro.TaskManager.TaskManagerAPI.domain.tasks;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
public interface TaskRepositoryInterface {
    CompletableFuture<Optional<TaskEntitie>> findById(String id);
    CompletableFuture<List<TaskEntitie>> findAllByCategory(String categoryId);
    CompletableFuture<List<TaskEntitie>> findAllByDescription(String description);
    CompletableFuture<List<TaskEntitie>> findAll();
    CompletableFuture<Void> save(TaskEntitie task);
    CompletableFuture<Void> update(TaskEntitie task);
    CompletableFuture<Void> deactivate(TaskEntitie task);
}
