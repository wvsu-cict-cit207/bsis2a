package company;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Calculator {
extends JFrame implements ActionListener
{      
   JButton e10,e11,e12,e13,e14,e15; 
   JButton e[]=new JButton[10];
    int i,r,n1,n2;
    JTextField res;
    char op; 
   public Calculator()
  {
  super("Calculator");
      setLayout(new BorderLayout());
      JPanel p=new JPanel();
      p.setLayout(new GridLayout(4,4));
      for(int i=0;i<=9;i++)
      {
        b[i]=new JButton(i+"");
        p.add(b[i]);
        b[i].addActionListener(this);
      }
      e10=new JButton("+");
      p.add(b10);
      e10.addActionListener(this);
 
      e11=new JButton("-");
      p.add(b11);
      e11.addActionListener(this);
      e12=new JButton("*");
      p.add(b12);
      e12.addActionListener(this);
 
      e13=new JButton("/");
      p.add(b13);
      e13.addActionListener(this);
 
      e14=new JButton("=");
      p.add(b14);
      e14.addActionListener(this);
      
      e15=new JButton("C");
      p.add(b15);
      e15.addActionListener(this);
 
      res=new JTextField(10);
      add(p,BorderLayout.CENTER);
      add(res,BorderLayout.NORTH);
      setVisible(true);
      setSize(100,100);
     }
     public void actionPerformed(ActionEvent ae)
{
  JButton pe=(JButton)ae.getSource();
	if(pe==b15)
	{
	 r=n1=n2=0;
	 res.setText("");
	}
	else
		if(pe==b14)
		{
 		 n2=Integer.parseInt(res.getText());
  		 eval();
  		 res.setText(""+r);
		}
 
		else
		{
 		  boolean opf=false;
 		  if(pe==b10)
			{ op='+';
			  opf=true;
			}
 		  if(pe==b11)
			{ op='-';opf=true;}
		  if(pe==b12)
			{ op='*';opf=true;}
		  if(pe==b13)
			{ op='/';opf=true;}
	
		  if(opf==false)
		  {
  		   for(i=0;i<10;i++)
		   {
		  	if(pe==b[i])
     		  	{
           	   	String t=res.getText();
           		t+=i;
            		res.setText(t);
		  	}
		   }
		  }
		  else
		  {
    			n1=Integer.parseInt(res.getText());
     			res.setText("");
		  }
		}
}
int eval()
{
	switch(op)
	{
 	case '+':   r=n1+n2;  break;
 	case '-':    r=n1-n2;   break;
 	case '*':    r=n1*n2; break;
 	case '/':    r=n1/n2; break;
 
	}
	return 0;
}
 
  public static void main(String arg[])
  {
      new Calculator();
   }
}

