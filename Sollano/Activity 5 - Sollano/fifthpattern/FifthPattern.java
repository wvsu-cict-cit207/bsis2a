package fifthpattern;

public class FifthPattern {

    public static void main(String[] args) {
        for(int i=0; i<5; i++)
        {
            for(int j=4; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print(i+1);
            }
            for(int j=0; j<i; j++)
            {
                System.out.print(i+1);
            }
            System.out.print("\n");
        }
    }  
}
