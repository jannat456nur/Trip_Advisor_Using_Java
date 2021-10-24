package Jannat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input =new Scanner (System.in);
        String user,pass,confirmPass;

        System .out.print("Hi there!!For get help please registered first.");

        System .out.print("Enter your Username:");
        user=input.nextLine();



        System .out.print("Enter your pass:");
        pass=input.nextLine();


        System .out.print("Enter your confirm pass:");
        confirmPass=input.nextLine();
        if((pass.equals(confirmPass))){
            System.out.println("Welcome Sir/Madam,");
        }
        else{
            System.out.println("Something wrong!");
        }
        TripAdvisor obj = new TripAdvisor();
        obj.showMenu();

    }

}

class TripAdvisor{

    String customerName;
    String customerId;





    void showMenu() {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);


        System.out.println("\n");

        System.out.println("A :Hotel");
        System.out.println("B :Transport");
        System.out.println("C :Resturant");
        System.out.println("D : visiting spot");
        System.out.println("E : Exit The System");

        do {
            System.out.println("===========================================================*=");
            System.out.println("Enter Your Option");
            System.out.println("===========================================================*=");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {

                case 'A':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("The Grand Hotel  ");
                    System.out.println("Rose View Hotel  ");
                    System.out.println("Hotel Grand Surma  ");
                    System.out.println("Jatra flagship sylhet City Centre  ");
                    System.out.println("Hotel holy gate  ");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Motorbus");
                    System.out.println("Taxie");
                    System.out.println("CNG");
                    System.out.println("Pathao");
                    System.out.println("Uber");
                    System.out.println("-------------------------------------------------------");


                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Panshi resturant ");
                    System.out.println("Kutum bari ");
                    System.out.println("Pach Vhai Resturant ");
                    System.out.println("The Mad Grill ");
                    System.out.println("Nilkhanta TeaCabine ");
                    System.out.println("Nirvana Inn ");
                    System.out.println("Bhujon Bari ");
                    System.out.println("Pizza Hut ");
                    System.out.println("-------------------------------------------------------");


                    break;

                case 'D':
                    System.out.println("-------------------------------------------------------");

                    System.out.println("Lalakhan");
                    System.out.println("Tanguar haor");
                    System.out.println("Panthumai ");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E' :
                    System.out.println("=========================================================================================================");
                    break;

                default:
                    System.out.println("Invalid Option!! Please Enter Correct Opton...");
                    break;
            }
        }
        while(option != 'E');
        System.out.println("Thank You for Using our Services.....!!");
    }
}