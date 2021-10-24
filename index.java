package Jannat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
//        Scanner input =new Scanner (System.in);
//        String user,pass,confirmPass;
//
//        System .out.print("Hi there!!For get help please registered first.Please register yourself");
//
//        System .out.print("Enter your Username:");
//        user=input.nextLine();
//
//
//
//        System .out.print("Enter your pass:");
//        pass=input.nextLine();

//
//        System .out.print("Enter your confirm pass:");
//        confirmPass=input.nextLine();
//        if((pass.equals(confirmPass))){
//            System.out.println("Welcome Sir/Madam,Now you can enjoy our service!!!");
//        }
//        else{
//            System.out.println("Something wrong!");
//        }
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
        System.out.println("Our services are:");
        System.out.println("A :Stay");
        System.out.println("B :Transport");
        System.out.println("C :Restaurants");
        System.out.println("D : Place to visit ");
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
                    System.out.println("1.The Grand Hotel  ");
                    System.out.println("* HS Tower 3rd Floor waves-1 east,Dargah gate Sylhet");
                    System.out.println("* phone:01970793366");
                    System.out.println("\n");

                    System.out.println("2.2nd Home");
                    System.out.println("* Boroshola,Airport Rd,Sylhet");
                    System.out.println("* phone:01733627929");
                    System.out.println("\n");


                    System.out.println("3.Hotel payara");
                    System.out.println("* Daragah gate Sylhet ");
                    System.out.println("* Phone:01300817865");
                    System.out.println("\n");

                    System.out.println("4.Almas Hotel");
                    System.out.println("* Shahrapara majar road,sylhet");
                    System.out.println("* phone;01725988211");
                    System.out.println("\n");


                    System.out.println("5.Hotel Mira garden");
                    System.out.println("* Tamabil Road sylhet");
                    System.out.println("* 0821719281");
                    System.out.println("\n");

                    System.out.println("6.Hotel Golden City");
                    System.out.println("* Jail Road,sylhet");
                    System.out.println("* Phone:0821726379");
                    System.out.println("\n");

                    System.out.println("7.Nazal Dornitory Hotel");
                    System.out.println("* Beside Central Hospital,sylhet");
                    System.out.println("* 01971873032");
                    System.out.println("\n");

                    System.out.println("8.Nirvana Inn");
                    System.out.println("* Mirza Jangal Road ,sylhet");
                    System.out.println("* 0821727640");
                    System.out.println("\n");

                    System.out.println("9.La Vista Hotel");
                    System.out.println("* vip road lamabazar Road,sylhet");
                    System.out.println("* phone:01966779999");
                    System.out.println("\n");



                    System.out.println("10.Hotel Metro Internatinal ");
                    System.out.println("* East Bandar Bazar,Dupurdigir Par");
                    System.out.println("* phone:0821720848");
                    System.out.println("\n");



                    System.out.println("11.Shuktara Nature Retreat");
                    System.out.println("* Uddin Hill ,Shahporan vposhohor");
                    System.out.println("* phone:01764543535");
                    System.out.println("\n");


                    System.out.println("12.Hotel Grand Surma  ");
                    System.out.println("* Gazi ,syed burhan uddin road,sylhet");
                    System.out.println("* phone:01707180152");
                    System.out.println("\n");

                    System.out.println("13.Noven INN & Holidays ");
                    System.out.println("* Khas dabir ,airport rd,Syhet ");
                    System.out.println("* phone:01707180152  ");
                    System.out.println("\n");

//                    System.out.println("Jatra flagship sylhet City Centre  ");
//                    System.out.println("Hotel holy gate  ");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':




                    System.out.println("-------------------------------------------------------");
                    System.out.println("1.Bus");
                    System.out.println("* Kadamtoli  Bus terminal");
                    System.out.println("* Airport Road Bus Stop");
                    System.out.println("* Chowkidekhi Town bBus station");
                    System.out.println("* Kadamtoli  Bus terminal");
                    System.out.println("* Intercity Bus Station ");
                    System.out.println("* Purala Gate Bus Stand");

                    System.out.println("2.CNG");
                    System.out.println("*You can get CNG from any palce at town");
                    System.out.println("\n");

                    System.out.println("3.Rickshaw");
                    System.out.println("* Rickshaw are also available in any place at town");
                    System.out.println("\n");

                    System.out.println("4.Ride Sharing");
                    System.out.println("* Sylhet Ride Sharing,Phone:01724797892");
                    System.out.println("\n");

                    System.out.println("5.Uber");
                    System.out.println("* Ananda Tower 9th Floor");
                    System.out.println("* Jail Road Sylhrt");
                    System.out.println("* Phone:0184447999");
                    System.out.println("\n");

                    System.out.println("6.Pathao LTD");
                    System.out.println("* Jhorna Complex,Kumarpara Road Sylhrt");
                    System.out.println("* Phone:09678202202");
                    System.out.println("\n");


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