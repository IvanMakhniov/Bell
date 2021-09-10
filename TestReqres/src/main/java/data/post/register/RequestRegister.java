package data.post.register;

public class RequestRegister {
    private String email;
    private String password;


    public RequestRegister(){
        super();
    }
    public RequestRegister(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public RequestRegister(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
