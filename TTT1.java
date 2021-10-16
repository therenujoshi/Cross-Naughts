import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TTT1 extends JFrame implements ItemListener, ActionListener
{
	int i,j,ii,jj,x,y,yesnull; 
	int a[][]={{10,1,2,3,11},{10,1,4,7,11},{10,1,5,9,11},{10,2,5,8,11},
                {10,3,5,7,11},{10,3,6,9,11},{10,4,5,6,11},{10,7,8,9,11} };
	int a1[][]={{10,1,2,3,11},{10,1,4,7,11},{10,1,5,9,11},{10,2,5,8,11},
                {10,3,5,7,11},{10,3,6,9,11},{10,4,5,6,11},{10,7,8,9,11} };
	boolean state,type,set;
	Icon ic1,ic2,icon,ic11,ic22;
	Checkbox c1,c2;
	JLabel l1,l2;
	JButton b[]=new JButton[9];
	JButton reset;
	public void showButton()
	{
		x=10; y=10;j=0;
		for(i=0;i<=8;i++,x+=100,j++)
		{
		b[i]=new JButton();
		if(j==3)
		 {j=0; y+=100; x=10;}
		b[i].setBounds(x,y,100,100);
		add(b[i]);
		b[i].addActionListener(this);
		}//eof for
		reset=new JButton("RESET");
		reset.setBounds(100,350,100,50);
		add(reset);
		reset.addActionListener(this);
	 }//eof showButton
    public static void main(String []args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new TTT1();
    }
}