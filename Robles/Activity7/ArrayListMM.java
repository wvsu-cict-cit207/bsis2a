import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListMM {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> aList = new ArrayList<Integer>();

    public static void main(String[] args) {
        System.out.println("Enter how many values: ");
        int user = sc.nextInt();
        System.out.println("Enter the numbers: ");
        for(int i   =0; i < user; i++){

           aList.add(sc.nextInt());
        }
        System.out.println(aList);
            int max = Maxi(aList);
        System.out.println("Maximum number is: " + max);
            int min = Mini(aList);
        System.out.println("Minimum number is: " + min);
    }
    static int Maxi(ArrayList<Integer> aList){
        int max = Integer.MIN_VALUE;
        for(int num : ArrayListMM.aList){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    static int Mini(ArrayList<Integer> aList){
        int min = Integer.MAX_VALUE;
        for(int num : ArrayListMM.aList){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
