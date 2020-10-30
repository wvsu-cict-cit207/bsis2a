public class loopthree {
    public static void main(String[] args){
        int counter=5;

        for(int row=1; row<=counter; row++){
            for(int col=0; col<=counter-row; col++){
                System.out.print(" ");
            }
            for(int col=0; col<row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
