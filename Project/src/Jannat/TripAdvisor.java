package Jannat;
import java.util.Scanner;

public class TripAdvisor {

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
                    System.out.println("* Uddin Hill ,Shahporan uposhohor");
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
                    System.out.println("1.In Zindabazar ");
                    System.out.println("Panshi resturant ");
                    System.out.println("Kutum bari ");
                    System.out.println("Pach Vhai Resturant ");
                    System.out.println("The Mad Grill ");
                    System.out.println("Nilkhanta TeaCabine ");
                    System.out.println("Nirvana Inn ");
                    System.out.println("Bhujon Bari ");
                    System.out.println("Pizza Hut ");
                    System.out.println("Woondaal King kabab ");
                    System.out.println("Spicy Restaurant ");
                    System.out.println("Kebab garden ");
                    System.out.println("Kazi Asparagus Food Island ");
                    System.out.println("Hattrick gate");
                    System.out.println("Food Lounge ");
                    System.out.println("The steak Blast ");
                    System.out.println("Coffee Cobana ");
                    System.out.println("Chick Chicken ");
                    System.out.println("Brick lane Restaurant ");
                    System.out.println("Bhujon bari ");
                    System.out.println("Food lover");
                    System.out.println("The Magicion ");
                    System.out.println("Tandoori house");
                    System.out.println("The Swad");
                    System.out.println("Grill Pill restaurant");
                    System.out.println("White Chilli ");
                    System.out.println("KFC ");
                    System.out.println("Food Castle ");
                    System.out.println("Sinbad ");
                    System.out.println("Yummy Restaurant");
                    System.out.println("Sip and Bite ");
                    System.out.println("Q-Bistro");
                    System.out.println("Titanic Restaurant ");
                    System.out.println("\n ");




                    System.out.println("2.In Kumarpara ");
                    System.out.println("Platinum Launge");
                    System.out.println("Pizza Express ");
                    System.out.println("Curry Royal ");
                    System.out.println("The coffee club");
                    System.out.println("The Lunchon Restaurant ");
                    System.out.println("Kebab Cottage");
                    System.out.println("Hungry station");
                    System.out.println("\n ");


                    System.out.println("3.In Shahjalal Uposhohor ");
                    System.out.println("Al Haramain restaurant ");
                    System.out.println("Snakes Lane");
                    System.out.println("Haat food Court ");
                    System.out.println("Lemense ");
                    System.out.println("Bay Leaf Chinese restaurant");
                    System.out.println("\n ");

                    System.out.println("4.In Tilaghor ");
                    System.out.println("Chaat Buzz ");
                    System.out.println("Hazi Biriyani House");
                    System.out.println("Boishaki Restaurant");
                    System.out.println("Cafe ground");
                    System.out.println("Al Layali dinner");
                    System.out.println("\n ");




                    System.out.println("5.Near Sust");
                    System.out.println("Himur Bhojor Bilash");
                    System.out.println("Rice and Spice ");
                    System.out.println("Snakes lane ");
                    System.out.println("\n");

                    break;

                case 'D':
                    System.out.println("-------------------------------------------------------");

                    System.out.println("Al Amjad;s Clock,'\n #Located on the bank of Surma'");
                    System.out.println("Keane Bride");
                    System.out.println("Meuseum of Rajas ");
                    System.out.println("Hazrat Shahjalal Mazar Sharit");
                    System.out.println("MAG Osmani Museum");
                    System.out.println("Wildlife Conervation ");
                    System.out.println("Abangi Tila");
                    System.out.println("Tanguar haor");
                    System.out.println("Lakkatura Tea Garden ");
                    System.out.println("Kazir Bazar bridge ");
                    System.out.println("Tilaghor Eco Park ");
                    System.out.println("Khadimnagar National Park ");
                    System.out.println("Adventure World amusement");
                    System.out.println("Sylhet Zoo");
                    System.out.println("Bongabari Osmani Shishu Uddan ");
                    System.out.println("Sust");
                    System.out.println("Manipuri Rajbari ");
                    System.out.println("Guabari Walkway");
                    System.out.println("Shurma river");
                    System.out.println("Tanguar haor");
                    System.out.println("Panthumai ");
                    System.out.println("Jalalabad Park");
                    System.out.println("Sheik Hasina Shishu Park ");
                    System.out.println("Tree Top Adventure Forum");
                    System.out.println("Selfie Bridge");
                    System.out.println("Tanguar haor");
                    System.out.println("Panthumai ");
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
