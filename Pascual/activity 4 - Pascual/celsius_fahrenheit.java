import java.util.Scanner;
public class celsius_fahrenheit {
    public static void main(String args[]){
    double fahrenheit,celsius;
    Scanner sc = new Scanner(System.in);
    System.out.println("choose [1] Celsius to fahrenheit [2] Fahrenheit to celsius");
    int ch=sc.nextInt();
    switch (ch)
    {
        case 1:
            System.out.println("Enter celsius temperature ");
            celsius = sc.nextDouble();
            fahrenheit=(9*celsius)/5+32;
            System.out.println("Fahrenheit temperature is ="+ fahrenheit);
            break;
        case 2:
            System.out.println("Enter fahrenheit temperature");
            fahrenheit = sc.nextDouble();
            celsius=(fahrenheit-32)*5/9;
            System.out.println("Celsius temperature is ="+celsius);
    }
}
}