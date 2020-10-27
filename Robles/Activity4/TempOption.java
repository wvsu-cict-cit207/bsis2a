
import java.io.*;
import java.util.Scanner;
public class TempOption {
    public static void main(String[] args){
        Scanner in = new Scanner(System. in );
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        float Cs,Fht;
        try {
            System.out.println("Enter 0- Celsius to Fahrenheit ");
            System.out.println("Enter 1- Fahrenheit to Celsius ");
            System.out.println("Please choose any option: ");
            int temp = Integer.parseInt(br.readLine());

            switch (temp){
                case 0 :
                    System.out.print("Enter temperatue in Celsius: ");
                    Cs = in.nextInt();
                        Fht = (Cs * 9) / 5 + 32;
                    System.out.println("Temperatue in Fahrenheit = " + Fht);
                    break;

                case 1:
                    System.out.print("Enter temperatue in Fahrenheit: ");
                    Fht = in .nextInt();
                    Cs = ((Fht - 32) * 5) / 9;
                    System.out.println("Temperatue in Celsius = " + Cs);
                    break;


                default:break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

