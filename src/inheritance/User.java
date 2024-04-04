package inheritance;

public class User {
    int user_id;
    private String password;
    String email;
    int age;

    String getPassword(){
        return  password;
    }

    void setPassword(String password){
        this.password = password;
    }
}