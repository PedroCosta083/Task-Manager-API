package pedro.TaskManager.TaskManagerAPI.domain.users;

import java.util.Date;

public class Users_Entitie {
    private String id;
    private String name;
    private Date birthday ;
    private String login  ;
    private String password ;
    private String email ;

    public Users_Entitie(String id, String name, Date birthday, String login, String password, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
