package pedro.TaskManager.TaskManagerAPI.domain.users;

import java.util.Date;
import java.util.regex.Pattern;

public class UsersEntitie implements UsersInterface {
    private String id;
    private String name;
    private Date birthday ;
    private String login  ;
    private String password ;
    private String email ;

    public UsersEntitie(String id, String name, Date birthday, String login, String password, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.login = login;
        this.password = password;
        this.email = email;
        validate();
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public Date getBirthday() {
        return birthday;
    }


    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }


    public String getEmail() {
        return email;
    }

    public void validate() {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if (birthday == null) {
            throw new IllegalArgumentException("Birthday cannot be null");
        }

        if (login == null || login.isEmpty()) {
            throw new IllegalArgumentException("Login cannot be null or empty");
        }

        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }

        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Email is not in a valid format");
        }
    }

    // Método auxiliar para validar o formato do e-mail
    private boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }
}
