package Fabia;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      String q1= "1.which one of these called gateway of sylhet city?\n"
              +"(a) Shahajalal Bridge\n (b)Keane bridge\n (C) KAzir Bazar Bride\n";
        String q2= "2.What is the ancient name of Sylhet? \n"
                +"(a)Shrihotto\n (b)Shrehot\n(c)Silot\n";
          String q3= "3.How many tea garden are there in Sylhet?\n"
                +"(a) 125\n (B)167\n (c)135\n";
            String q4="4.Which one is the biggest tea garden in Sylhet?\n"
                        +"(a)Lakkatura Tea garden\n (b) Malnicherra Tea garden\n(c)Moubon Tea Garden\n";
                  String q5 ="5.What is the written form of Sylhet's local language?\n"
                  +"(a)Katli\n(B)Gurmukhi\n(c)Nagri\n";
                          String q6="6.Which is the largest ethnic group in Sylhet?\n"
                                  +"(a)Chakma\n(b)Gharu\n(c)Monipuri\n";
                                  String q7="7.When did Sylhet come under Bengal Presidency?\n"
                                          +"(a)1876\n(b)1971\n(c)1765\n";
                                  String q8="8.Sylhet city located on the bank of-\n"
                                          +"(a)Surma\n(b)Kushiyara\n(c)Kalni\n";
                                  String q9= "9.How many rivers are in Sylhet?\n"
                                          +"(a)20\n(b)36\n(d)26";
                                  String q10 ="10.Which one is the largest Eco Park is Sylhet City?\n"
                                          +"(a)Khadimnagar park\n(b)Jalalabad Park\n(c)Tilagar park\n";

                                  Question[] questions = {

                                          new Question  (q1, "b"),
        new Question  (q2, "a"),
        new Question  (q3, "c"),
        new Question  (q4, "b"),
        new Question  (q5, "c"),
        new Question  (q6, "c"),
        new Question  (q7, "c"),
        new Question  (q8, "a"),
        new Question  (q9, "b"),
        new Question  (q10, "c"),
};
      takeTest(questions);
    }
    public static void takeTest (Question [] questions) {
        int score = 1;
        Scanner Input = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i].prompt);
            String answer = Input.nextLine();
            if (answer.equals(questions[i].answer)) {
                score++;
            }
            }
            System.out.println("YOu got" + score + "/" + questions.length);
        }
    }
