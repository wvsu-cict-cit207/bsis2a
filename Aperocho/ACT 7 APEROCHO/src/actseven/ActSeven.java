package actseven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ActSeven {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int minimum, maximum, numSize;

        System.out.print("Enter element size: ");
        numSize = sc.nextInt();

        System.out.println("Enter " + numSize + " integers: ");
        for (int i = 0; i < numSize ; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
            maximum = Collections.max(numbers);
            minimum = Collections.min(numbers);

            System.out.println("Largest Element: " + maximum );
            System.out.println("Smallest Element: " + minimum );
        }
    }


