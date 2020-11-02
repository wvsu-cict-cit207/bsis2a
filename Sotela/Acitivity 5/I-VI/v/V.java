
package v;

public class V {

    public static void main(String[] args) {
       int row,i,j,n=5;
         for (row =1; row<=5;row++)
         {
             for (i = 1; i<n;++i)
                 System.out.print(" ");
             --n;
              
             for (j=1;j<=2*row-1;j++)
                  System.out.print(row);
             
                 System.out.print("\n");
             
         }
    }
    
}
