package pedro.TaskManager.TaskManagerAPI.domain.base;

import java.util.concurrent.CompletableFuture;

public interface BaseUseCaseInterface {
    CompletableFuture<Object> execute(Object input);

}
