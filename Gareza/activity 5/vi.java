public class vi {
    public static void main(String[] args) {
        int pp=5;
        for (int i=1;i<=pp;i++){
            for (int j=1;j<=(pp-i)*2;j++){
                System.out.print(" ");
            }
            for (int a=i;a>=1;a--){
                System.out.print(" "+a);
            }
            for (int l=2;l<=i;l++){
                System.out.print(" "+l);
            }
            System.out.println();
        }
    }
}