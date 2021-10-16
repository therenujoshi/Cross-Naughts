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
    public static void main(String []args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new TTT1();
    }
}