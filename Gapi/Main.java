package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        double f,c,in;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number you want to convert:");
         in = sc.nextDouble();

        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            c=(in-32)*5/9;
            System.out.println("Celsius temperature is = "+c);
            break;
            case 2:
            f=((9*in)/5)+32;
            System.out.println("Fahrenheit temperature is = "+f);
            break;
            default:  System.out.println("please choose valid choice");
                }
            }
        }
	// write your code here

