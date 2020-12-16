import java.util.ArrayList;
import java.util.Scanner;

public class activityseven {
    static Scanner inp = new Scanner(System.in);
    static ArrayList<Integer> arr = new ArrayList<>();

    static int getMin(ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;
        for (int k : activityseven.arr)
            if (min > k)
                min = k;
        return min;
    }

    static int getMax(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int j : activityseven.arr)
            if (max < j)
                max = j;
        return max;
    }

    public static void main(String[] args) {
        int sz;

        System.out.print("Enter Desired Size of Array: ");
        sz = inp.nextInt();

        for (int i = 0; i < sz; i++) {
            System.out.print("Enter Value: ");
            arr.add(inp.nextInt());
        }

        System.out.println("Values You Entered: "+ arr);
        int min = getMin(arr);
        int max = getMax(arr);
        System.out.println("Smallest Value is: "+ min);
        System.out.println("Largest Value is: "+ max);


    }

}
