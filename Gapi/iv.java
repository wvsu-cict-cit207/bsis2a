package com.company;

public class Main {

    public static void main(String[] args) {
        {
            int s = 4, ss = 1;
            for (int i = 1; i <= 5; i++) {
                System.out.println();
                for (int j = 1; j <= s; j++)
                    System.out.print(" ");
                for (int k = 1; k <= ss; k++)
                    System.out.print("*");
                s--;
                ss += 2;
            }
        }
    }
}