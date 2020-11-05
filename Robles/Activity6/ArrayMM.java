import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayMM {

    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        Integer[] num = new Integer[10];

            for (int x = 0; x <num.length;x++ ){
                num[x]= sc.nextInt();
            }
            //Sir I used Collections as it is easy to return the minimum/maximum element of the given collection
            // and The Arrays class of the java. util package contains several static methods that can be used to
            // fill, sort, search, etc in arrays.
            int mi = (int) Collections.min(Arrays.asList(num));
            int ma = (int) Collections.max(Arrays.asList(num));

        System.out.println("Minimum number is : " + mi);
        System.out.println("Maximum number is : " + ma);
    }


}
