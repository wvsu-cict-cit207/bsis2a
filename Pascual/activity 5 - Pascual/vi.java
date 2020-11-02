public class vi {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=(5-i)*2;j++){
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
