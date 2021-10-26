package Jannat;

public class Register {


    String userName, password;

    Register(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void Store(String name, String pass){
        this.userName = name;
        this.password = pass;


        System.out.println("Sucsessfully register");
    }

    public void Login(String name,String pass){
        if(this.userName.equals(name)  && pass.equals(pass) ){
            System.out.println("Successfully Logged in");
        } else {
            System.out.println("Login failed :( \n Please Try Again");
        }
    }
}
