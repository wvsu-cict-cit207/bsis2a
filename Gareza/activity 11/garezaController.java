package finals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class garezaController {
    garezaView GAREZAVIEW;
    garezaController(garezaView GAREZAVIEW){
        this.GAREZAVIEW = GAREZAVIEW;
        GAREZAVIEW.addd(new add());
        GAREZAVIEW.minn(new min());
        GAREZAVIEW.divvv(new div());
        GAREZAVIEW.mulll(new mul());
        GAREZAVIEW.quooo(new quo());
        GAREZAVIEW.clrrr(new clr());

    }

    class add implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == GAREZAVIEW.add) {
                int num1 = Integer.parseInt(GAREZAVIEW.textnum1.getText());
                int num2 = Integer.parseInt(GAREZAVIEW.textnum2.getText());
                int sum = garezaModel.add(num1,num2);
                GAREZAVIEW.blank.setText("           = "+sum);
            }
        }
    }

    class min implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == GAREZAVIEW.min) {
                int num1 = Integer.parseInt(GAREZAVIEW.textnum1.getText());
                int num2 = Integer.parseInt(GAREZAVIEW.textnum2.getText());
                int diff = garezaModel.min(num1,num2);
                GAREZAVIEW.blank.setText("           = "+diff);
            }
        }
    }

    class mul implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == GAREZAVIEW.mul) {
                int num1 = Integer.parseInt(GAREZAVIEW.textnum1.getText());
                int num2 = Integer.parseInt(GAREZAVIEW.textnum2.getText());
                int pro = garezaModel.mul(num1,num2);
                GAREZAVIEW.blank.setText("           = "+pro);
            }
        }
    }

    class div implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == GAREZAVIEW.div) {
                double num1 = Double.parseDouble(GAREZAVIEW.textnum1.getText());
                double num2 = Double.parseDouble(GAREZAVIEW.textnum1.getText());
                double divv = garezaModel.div(num1,num2);
                GAREZAVIEW.blank.setText("           = "+divv);
            }
        }
    }

    class quo implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == GAREZAVIEW.quo) {
                double num1 = Double.parseDouble(GAREZAVIEW.textnum1.getText());
                double num2 = Double.parseDouble(GAREZAVIEW.textnum1.getText());
                double quoo = garezaModel.quo(num1,num2);
                GAREZAVIEW.blank.setText("           = "+quoo);
            }
        }
    }

    class clr implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == GAREZAVIEW.clr) {
                GAREZAVIEW.textnum1.setText("           ");
                GAREZAVIEW.textnum2.setText("           ");
                GAREZAVIEW.blank.setText("           = ");
            }
        }
    }
}
