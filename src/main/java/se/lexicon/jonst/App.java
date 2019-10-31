package se.lexicon.jonst;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static Scanner scan;

    public static void main(String[] args) throws Exception {

        scan = new Scanner(System.in);

        //System.out.println("Domo arigato!");

        boolean keepAlive = true;




        while (keepAlive) {


            System.out.println("----- Menu -----\n1: Full name\n2: Some math\n0: Quit");
            int selection = Integer.parseInt(AskUserFor("Selection"));

            switch (selection) {
                case 1:
                    AskUserForFullName();
                    break;
                case 2:
                    someMath();
                    break;
                case 0:
                    System.out.println("Bye!");
                    keepAlive = false;
                    break;
                default:
                    System.out.println("Illegal choice!");
            }
        }

        scan.close();

    }

    static void AskUserForFullName() {

        String firstName = AskUserFor("first name");
        String lastName = AskUserFor("last name");

        System.out.println(firstName + " " + lastName);
    }

    static String AskUserFor(String term) {
        System.out.println("What's your " + term + "?");
        return scan.nextLine();
    }


    static void someMath() {

        long bigNum = 1000_000_000_000_000_000L;

        double result = 1.0 / 3;

        System.out.println(" 1/3 = " + result);
    }

    static boolean badCode() throws Exception {
        throw new Exception();
    }
}


/*
        char selection = 'A';

        switch (Character.toLowerCase(selection)){
            case 'a':
                System.out.println("Apple");
                int aNumber = 0;
                break;
            case 'b':
                System.out.println("Banana");
                break;
            default:
                System.out.println("Invalid");

        }
 */

 /*
        System.out.println('a' + "1" );

        if(true || badCode())
        {
            System.out.println("&& is nice");
        }

        */