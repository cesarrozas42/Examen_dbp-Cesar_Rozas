package Entity;

public class User {
    public double id;
    public String username;
    public String email;
    private String password;
    public String role;

    public User(double ids, String user, String emails, String passwords, String roles){
        id = ids;
        username = user;
        email = emails;
        password = passwords;
        role = roles;
    }

    public double getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(double id) {
        this.id = id;
    }
}

