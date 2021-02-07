package company;
import java.util.Scanner;
public class studentinfo {

  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter name");
   String name=sc.nextLine();
         System.out.println("Enter your class");
         int cl=sc.nextInt();
         System.out.println("Enter section");

        char sec=sc.next().char (0);
        System.out.println("Name - "+name);
        System.out.println("Class - "+ clas);
        System.out.println("Section - "+sec);
  }
}
