package Jannat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Trip Advisor,To get services please register first..! \nPlease register");

        System.out.println("Enter your userName: ");
        String nam = input.nextLine();

        System.out.println("Enter your password: ");
        String pass = input.nextLine();

        Register register = new Register(nam, pass);


        System.out.println("\nPlease Login");


        System.out.println("userName: ");
        String logname = input.nextLine();

        System.out.println("password: ");
        String logpass = input.nextLine();


        register.Login(logname,logpass);


        TripAdvisor obj = new TripAdvisor();
        obj.showMenu();

        Quiz quiz = new Quiz();
        quiz.takeTest();

    }
}
