
package Jannat;
        import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // write your code here
        Scanner input =new Scanner (System.in);
        String user,confirmUser,pass,confirmPass;

        System .out.print("Hi there!!For get help please registered first.");

        System .out.print("Enter your Username:");
        user=input.nextLine();
        System .out.print("Enter your confirm Username:");
        confirmUser=input.nextLine();


        System .out.print("Enter your pass:");
        pass=input.nextLine();


        System .out.print("Enter your confirm pass:");
        confirmPass=input.nextLine();
        if(user.equals(confirmUser)&&(pass.equals(confirmPass))){
            System.out.println("Welcome Sir/Madam,");
        }
        else{
            System.out.println("Something wrong!");
        }
        BankAccount obj = new BankAccount();
        obj.showMenu();

    }

}

class BankAccount{
    int balance;
    int previousTransaction;
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

        do
        {
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println("Enter Your Option");
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {

                case 'A':

                    char ch;
                    System.out.println("-------------------------------------------------------");
                    System.out.println("The Grand Hotel  ");
                    System.out.println("Rose View Hotel  ");
                    System.out.println("Hotel Grand Surma  ");
                    System.out.println("Jatra flagship sylhet City Centre  ");
                    System.out.println("Hotel holy gate  ");

                    System.out.println("-------------------------------------------------------");
                    ch = scanner.next().charAt(0);
                    System.out.println("\n");
                    //break;
                case'B':
                    do {
                        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
                        System.out.println("Enter Your Option");
                        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
                        option = scanner.next().charAt(0);
                        System.out.println("\n");


                        switch (option)
                        {

                            case'a':
                                System.out.println("-------------------------------------------------------");
                                System.out.println("Put a for Motorbus ,b for Taxie ,c for CNG,d for Pathao,e for Uber");
                                System.out.println("Motorbus");
                                System.out.println("-------------------------------------------------------");
                                ch = scanner.next().charAt(0);
                                System.out.println("\n");
                                break;
                            case'b':
                                System.out.println("Taxie");
                                System.out.println("-------------------------------------------------------");
                                ch = scanner.next().charAt(0);
                                System.out.println("\n");
                                break;
                            case'c':
                                System.out.println("CNG");
                                System.out.println("-------------------------------------------------------");
                                ch = scanner.next().charAt(0);
                                System.out.println("\n");
                                break;
                            case'd':
                                System.out.println("Pathao");
                                System.out.println("-------------------------------------------------------");
                                ch = scanner.next().charAt(0);
                                System.out.println("\n");
                                break;
                            case'e':
                                System.out.println("Uber");
                                System.out.println("-------------------------------------------------------");
                                ch = scanner.next().charAt(0);
                                System.out.println("\n");
                                break;
                            default:
                                System.out.println("-------------------------------------------------------");
                                System.out.println("Wrong choice");
                                //break;

                        }

                    }
                    while(option != 'E');
                    System.out.println("Thank You for Using our Services.....!!");



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