public class loopfour {
    public static void main(String[] args) {
        int i=5, j;

        for (int row=1; row<=i; row++) {
            for (int col=1;col<=i-row; col++) {
                System.out.print(" ");
            }

            for(j=1; j<=2*row-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
