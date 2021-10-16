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
     /*********************************************************/
	public  void check(int num1)
	{
	  for(ii=0;ii<=7;ii++)
	  {
	     for(jj=1;jj<=3;jj++)
	     {
	        if(a[ii][jj]==num1)
	        {
		 a[ii][4]=11;  
	     	}

	     }
	   }
	}
	/**********************************************************/
	/*********************************************************/
	public void complogic(int num)
	{
	  for(i=0;i<=7;i++)
	  {
	    for(j=1;j<=3;j++)
	    {
	      if(a[i][j]==num){  a[i][0]=11; a[i][4]=10;    
	    }
	  }
        }
	for(i=0;i<=7;i++)
	{                         
	     set=true;  		   
	     if(a[i][4]==10){                                 
       int count=0;
       for(j=1;j<=3;j++){                                                //for 2 
           if(b[(a[i][j]-1)].getIcon()!=null){                               //if 2
             count++;
               }                                                                   //eof if 2
            else{ yesnull=a[i][j]; }
        }                                                                         //eof for 2
      if(count==2){                                                        //if 2
         b[yesnull-1].setIcon(ic2); 
         this.check(yesnull); set=false;break;
         }                                                                     //eof if 2
      }                                                                     //eof if 1
      else
	  if(a[i][0]==10){
                for(j=1;j<=3;j++){                                            //for2
                    if(b[(a[i][j]-1)].getIcon()==null){                                          //if 1
                      b[(a[i][j]-1)].setIcon(ic2);
                        this.check(a[i][j]);
                         set=false;
						 break;
                    }                                                    //eof if1
                }                                                              //eof for 2
                if(set==false)
                      break;                                                       
            }//eof elseif

    if(set==false)
         break;    
 }//eof for 1


}//eof complogic


/*********************************************************/
TTT1()
{
super("Tic-Tac-Toe Game (3x3) ");
setLocation(300,50);
CheckboxGroup cbg=new CheckboxGroup();
c1=new Checkbox("vs Computer",cbg,false);
c2=new Checkbox("vs Friend",cbg,false);
c1.setBounds(120,80,100,40);
c2.setBounds(120,150,100,40);
add(c1); add(c2);
c1.addItemListener(this);
c2.addItemListener(this);


state=true;type=true;set=true;
ic1=new ImageIcon("cross.png");
ic2=new ImageIcon("zero.jpg");
ic11=new ImageIcon("cross1.png");
ic22=new ImageIcon("zero1.jpg");

setLayout(null);
setSize(330,450);
setVisible(true);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}//eof constructor

/*************************************************************/
public void itemStateChanged(ItemEvent e){
 if(c1.getState())
  { 
 type=false;
 }

 else if(c2.getState())
  { type=true;
  }
remove(c1);remove(c2);
 repaint(0,0,330,450);
 showButton();
}//eof itemstate
/************************************************************/

    public static void main(String []args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new TTT1();
    }
}