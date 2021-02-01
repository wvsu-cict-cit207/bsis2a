package outputgreatestvalue;

import java.util.Scanner;

public class OutputGreatestValue {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = 10;
    int b = 23;
    int c = 5;
    
    int highest;
    
    highest = (a>b?a>c?a:c:b>c?b:c);
    
    System.out.println("Number 1 = " + a);
    System.out.println("Number 2 = " + b);
    System.out.println("Number 3 = " + c);
    System.out.println("The highest number is " + highest);
      
    }
    
}
