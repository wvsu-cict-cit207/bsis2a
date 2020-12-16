import java.util.Scanner;
public class activity_6 {
    public static void main(String[] args){
        Scanner gg = new Scanner(System.in);
        System.out.println("Enter 10 number:");
        int array[] = new int[10];
        for (int i=0;i<10;i++) {
            System.out.print("array number "+i+" : ");
            array[i]=gg.nextInt();
        }
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        int min =array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("the [Maximum] value is = "+max);
        System.out.println("the [Minimum] value is = "+min);
    }
}