package actseven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ActSeven {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int s, l, numSize;

        System.out.print("Enter element size: ");
        numSize = sc.nextInt();

        System.out.println("Enter " + numSize + " integers: ");
        for (int i = 0; i < numSize ; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
            l = Collections.max(numbers);
            s = Collections.min(numbers);

            System.out.println("Largest Element: " + l );
            System.out.println("Smallest Element: " + s );
        }
    }


