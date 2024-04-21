package pedro.TaskManager.TaskManagerAPI.domain.tasks;

import org.junit.jupiter.api.Test;
import pedro.TaskManager.TaskManagerAPI.domain.category.CategoryEntitie;
import pedro.TaskManager.TaskManagerAPI.domain.users.UsersEntitie;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TaskEntitieTest {
    @Test
    public void testValidTaskEntitie() {
        TaskEntitie task = new TaskEntitie(
                "1",
                "Task name",
                "Task description",
                new Date(), // createAt
                new Date(), // updateAt
                new Date(), // deactivateAt
                new CategoryEntitie("1","teste","CategoriaTeste",new Date(),new Date(),new Date()), // category
                "pending", // status
                new Date(), // dueDate
                "high", // priority
                new UsersEntitie("1","teste",new Date(),"Pedro","teste123@","pedrinho@gmail.com") // responsible
        );

        assertNotNull(task);
    }

    @Test
    public void testInvalidTaskEntitie() {
        try {
            TaskEntitie invalidTask = new TaskEntitie(
                    "1",
                    "", // Name empty
                    "Task description",
                    new Date(), // createAt
                    new Date(), // updateAt
                    new Date(), // deactivateAt
                    null, // category null
                    "", // status empty
                    null, // dueDate null
                    "", // priority empty
                    null // responsible null
            );
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid argument provided", e.getMessage());
        }
    }
}