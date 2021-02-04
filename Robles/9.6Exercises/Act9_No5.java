import java.util.Scanner;

public class Act9_No5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter character");
         char x = s.next().charAt(0);
        boolean c1;
        c1 = Character.isDigit(x);

        if(c1){
            System.out.println(c1);
        }
        else {
            System.out.println(c1);
        }
    }
}
