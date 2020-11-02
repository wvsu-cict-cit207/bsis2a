
package iv;

public class IV {

    public static void main(String[] args) {
     int i,j,row, n=5;
      
      for(row=1;row<=5;row++)
      {
          for (i=1;i<n;i++)
              System.out.print(" ");
          --n;
         
          for (j=1;j<=2*row-1;++j)
              
              System.out.print("*");
           
          System.out.print("\n");
              
      
        
       }
      
    }
    
}
