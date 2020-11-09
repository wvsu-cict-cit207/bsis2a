import java.util.Scanner;
public class act_6 {


    public static void main(String[] agrs) {
        Scanner ee = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int array[] = new int[11];
        for (int i=1;i<11;i++) {
            System.out.print("number "+i+" : ");
            array[i]=ee.nextInt();
        }
        for (int i=1;i<11;i++) {
            System.out.println("enter : ");
        }
        int max = array[1];
        for (int i=1;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        int min =array[1];
        for (int i=1;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("the Maximum value is = "+max);
        System.out.println("the Minimum value is = "+min);
    }
}