public class looptwo {
    public static void main(String[] args){
        int row, counter=4, col;

        for(row=0; row<=counter; row++){
            for(col=0; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
