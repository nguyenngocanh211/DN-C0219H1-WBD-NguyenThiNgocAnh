package example.model;

public class User {
    private String account;
    private String password;
    private String email;
    private String name;
    private int age;

    public String getAccount() {
        return account;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
     public int getAge() {
        return age;
     }

     public void setAccount(String account) {
        this.account = account;
     }
     public  void setPassword(String password){
        this.password = password;
     }
     public void setEmail(String email) {
        this.email = email;
     }
     public void setName (String name) {
        this.name = name;
     }
     public void setAge (int age){
        this.age = age;
     }




}
