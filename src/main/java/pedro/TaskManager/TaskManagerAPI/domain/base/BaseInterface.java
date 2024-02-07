package pedro.TaskManager.TaskManagerAPI.domain.base;

import java.util.Date;

public interface BaseInterface {
     String getId();
     String getName();
     String getDescription();
     Date getCreateAt();
     Date getUpdateAt();
     Date getDeactivateAt();
     void validate();
}
