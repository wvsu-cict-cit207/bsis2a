public class iv {
    public static void main(String[] args) {
        int line=5;
        for(int a=1;a<=line;a++){

            for(int b=a;b<line;b++)
                System.out.print(" ");
            for(int c=1;c<(a*2);c++)
                System.out.print("*");
            System.out.println();

        }
    }
}
