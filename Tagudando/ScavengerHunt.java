//Activity 9.6.1
//Class- the design from which objects are created
//Object- consists of data or things that correspond to the real world
//Instantiate- to call the constructor
//Instance Variable- variables that are in in an object and declared in class
//Instance Method- methods that needs an object of its class before it can be called
//Class variables- associated with the class and declared with static keyword
//Constructor- called when there's an object created


//Activity 9.6.2
import java.util.Scanner;

public class ScavengerHunt {
    static void one() {
        System.out.println("Enter Word: ");
        String str;
        str = sh.nextLine();
        boolean flag = str.endsWith("lo");
        System.out.println(flag);
    }

    static void two() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit: ");
        int dig = sc.nextInt();
        System.out.println("Enter Radix: ");
        int rad = sc.nextInt();
        char i = Character.forDigit(dig, rad);
        System.out.println("Character Representation:" + i);
    }

    static void three() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("JVM is starting...");
        runtime.halt(1);
        System.out.println("JVM Terminated");

    }

    static void four() {
        double x = 0;
        System.out.println("Enter Value: ");
        x = sh.nextDouble();
        double floored = Math.floor(x);
        System.out.println(floored);
    }

    static void five() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Input: ");
        char i = sc.next().charAt(0);
        boolean num = Character.isDigit(i);

        if(num){

            System.out.println("The Input You Entered is a Digit.\n");
        }
        else{
            System.out.println("The Input You Entered is Not a Digit.\n");
        }
    }

    static Scanner sh = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int opt = 0;
        SH:
        while (true) {
            System.out.println("Options:\n1.\n2.\n3.\n4.\n5.\n0. Exit");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    one();
                    break;
                case 2:
                    two();
                    break;
                case 3:
                    three();
                    break;
                case 4:
                    four();
                    break;
                case 5:
                    five();
                    break;
                case 0:
                    break SH;
                default:
                    System.out.println("Invalid!");
                    break;
            }

        }

    }
}