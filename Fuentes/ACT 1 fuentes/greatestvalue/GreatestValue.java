package greatestvalue;

public class GreatestValue {

    public static void main(String[] args) {
      
        int highestV, temporary;
        int num = 10, num1 = 23, num2 = 5;
       
        temporary = num>num1?(num1):(num1);
        highestV = num2>temporary ?(num2):(temporary);
System.out.print("Number 1:" + num + "\n");
        System.out.print("Number 2:" + num1 + "\n");
        System.out.print("Number 3:" + num2 + "\n");
        System.out.print("The highest number is = " + highestV);
    }
    
}
