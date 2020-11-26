import java.util.Scanner;
public class activitysix {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] sz= new int[10];
        int max, min;

        for (int i = 0; i < sz.length; i++) {
            System.out.print("Enter Number: ");
            sz[i] = inp.nextInt();
        }

        max=sz[0];
        for (int j = 1; j < sz.length; j++) {
            if (sz[j]>max)
                max = sz[j];
        }

        System.out.println("Maximum Number is:"+ max);

        min=sz[0];
        for (int k = 1; k<sz.length; k++) {
            if (sz[k]<min)
                min=sz[k];
        }
        System.out.print("Minimum Number is:"+ min);

    }
}
