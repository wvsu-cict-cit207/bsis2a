public class loopsix {
    public static void main(String[] args) {

        for (int row=1; row <=5; row++) {
            int i=5;
            for (int col = 1; col <= i-row; col++) {
                System.out.print(" ");
            }
            for(int j=row;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=row;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}