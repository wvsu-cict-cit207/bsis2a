import javax.swing.JOptionPane;
public class temperature_2 {
    public static void main (String[] args){
        int choice;
        double c,cc,f,ff;
        choice = Integer.parseInt(JOptionPane.showInputDialog(null,"[1] to solve for CELSIUS \n[2] to solve for FAHRENHEIT"));
        switch (choice){
            case 1:
                c = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a temperature in Fahrenheit: "));
                cc = (c-32)*5/9;
                JOptionPane.showMessageDialog(null,"This Is The Temperature \nin CELSIUS = "+cc);
                break;
            case 2:
                f = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a temperature in Celsius: "));
                ff = (f*9/5)+32;
                JOptionPane.showMessageDialog(null,"This is the Temperature \nIn FAHRENHEIT = "+ff);
                break;

            default:
                JOptionPane.showMessageDialog(null,">>INVALID INPUT<<");
        }
    }
}
