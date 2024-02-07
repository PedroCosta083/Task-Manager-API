package pedro.TaskManager.TaskManagerAPI.domain.users;

import java.util.Date;

public interface UsersInterface {
    String getId();
    String getName();
    Date getBirthday();
    String getLogin();
    String getPassword();
    String getEmail();
    void validate();
}
