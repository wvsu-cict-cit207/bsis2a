package averageofthreenum;
import java.util.Scanner;

public class AverageOfThreeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("number 1 = ");
        int num1 = sc.nextInt();
        System.out.print("number 2 = ");
        int num2 = sc.nextInt();
        System.out.print("number 3 = ");
        int num3 = sc.nextInt();
        
        System.out.print("Total average is: " + (num1+num2+num3)/3);
    }
    
}
