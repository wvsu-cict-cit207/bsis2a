package finals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class garezaView {
    JLabel result;
    JButton add;
    JButton clr;
    JButton min;
    JButton mul;
    JButton div;
    JButton quo;
    JLabel jlabelfirst;
    JLabel jlabelsecond;
    JLabel blank;
    JTextField textnum1;
    JTextField textnum2;
    public garezaView(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        jlabelfirst = new JLabel("First Number");
        textnum1 = new JFormattedTextField();
        jlabelsecond = new JLabel("Second Number");
        textnum2= new JFormattedTextField();
        result = new JLabel("result");
        blank = new JLabel("           = ");

        add = new JButton("+");
        min = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        quo = new JButton("%");
        clr = new JButton("CLEAR");

        panel.setBorder(BorderFactory.createEmptyBorder(10,50,10,50));
        panel.setLayout(new GridLayout(6,2));

        panel.add(jlabelfirst);
        panel.add(textnum1);
        panel.add(jlabelsecond);
        panel.add(textnum2);
        panel.add(result);
        panel.add(blank);
        panel.add(add);
        panel.add(min);
        panel.add(mul);
        panel.add(div);
        panel.add(quo);
        panel.add(clr);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("[Activity 11 - Gareza]");
        frame.pack();
        frame.setVisible(true);
    }
    public void addd(ActionListener a){
        add.addActionListener(a);
    }

    public void minn(ActionListener a){
        min.addActionListener(a);
    }
    public void mulll(ActionListener a){
        mul.addActionListener(a);
    }
    public void divvv(ActionListener a){
        div.addActionListener(a);
    }
    public void quooo(ActionListener a){
        quo.addActionListener(a);
    }
    public void clrrr(ActionListener a){
        clr.addActionListener(a);
    }
}
