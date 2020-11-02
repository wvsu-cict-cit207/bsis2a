public class iv {
    public static void main (String[] args){
        int pp=5;
        for (int i=1;i<=pp;i++){
            for (int j=i;j<pp;j++)
                System.out.print(" ");
                for (int a=1;a<(i*2);a++)
                    System.out.print("*");
                System.out.println();
        }
    }
}