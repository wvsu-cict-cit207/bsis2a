package com.jetbrains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int small, large, sizeNum;

        System.out.print("Enter the size of elements: ");
        sizeNum = sc.nextInt();

        System.out.println("Enter " + sizeNum + " integers: ");
        for (int i = 0; i < sizeNum ; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
            large = Collections.max(numbers);
            small = Collections.min(numbers);

            System.out.println("Largest Element: "
                    + large );
            System.out.println("Smallest Element: "
                + small );
        }
    }


