
public class iii {
    public static void main(String[] args) {
        int line = 5;
        for(int i=1; i <=line;i++ ){
            for(int j=1; j<=line - i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
