import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class practice {
    static ArrayList<Integer> array = new ArrayList<>();
    static Scanner q = new Scanner(System.in);

    public static void main(String[] args) {
        int pp;
        System.out.println("How many elements: ");
        pp = q.nextInt();
        for (int i=0;i<pp;i++) {
            System.out.print("Enter Element: ");
            array.add(q.nextInt());
        }
        System.out.println(array+"\n");
        int max = findMax(array);
        System.out.println("the [Maximum] value is = "+max);
        int min = findMin(array);
        System.out.println("the [Minimum] value is = "+min);
    }
    static int findMax(ArrayList<Integer> array){
        int max = Integer.MIN_VALUE;
        for (int qq : practice.array){
            if (qq>max){
                max=qq;
            }
        }
        return max;
    }
    static int findMin(ArrayList<Integer> array){
        int min = Integer.MAX_VALUE;
        for (int qq : practice.array){
            if (qq<min){
                min=qq;
            }
        }
        return min;
    }
}