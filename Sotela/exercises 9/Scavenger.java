package scavenger;

import java.util.Scanner;

public class Scavenger {

   static Scanner cs = new Scanner(System.in);
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int option = 0;
        Lamronba:
        while (true) {
            System.out.println("Options: \n1.  \n2.  \n3.  \n4. \n5. \n0. exit");
            option = sc.nextInt();
            switch (option) {
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
                    break Lamronba;
                default:
                    System.out.println("invalid");
                    break;
            }

        }

    }

    static void one() {

        System.out.println("enter word: ");
        String str;
        str = cs.nextLine();
        boolean flag = str.endsWith("lo");
        System.out.println(flag);
    }

    static void two() {
        int dig = 0;
        int rad = 0;
        System.out.println("enter digit: ");
        dig = cs.nextInt();
        System.out.println("enter radius: ");
        rad = cs.nextInt();
        System.out.println(Character.forDigit(dig, rad));
    }

    static void three() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("about to halt the current jvm");
        runtime.halt(1);
        System.out.println("jvm terminated");

    }

    static void four() {
        double x = 0;
        System.out.println("enter value: ");
        x = cs.nextDouble();
        double floored = Math.floor(x);
        System.out.println(floored);
    }

    static void five() {
        int eve = 0;
        System.out.println("enter number: ");
        eve = cs.nextInt();
        boolean flag = Character.isDigit(eve);
        
        if(flag){
            
            System.out.println("the number "+eve+" is a digit.\n");
            
        }
        else{
            System.out.println("the number "+eve+" is not digit.\n");
        }
}
}