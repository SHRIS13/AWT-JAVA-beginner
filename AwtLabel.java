import java.awt.*;
import java.awt.event.*;
class AwtLabel{
public static void main(String args[]){

    Frame f1  = new Frame(" Labels in AWT-JAVA ");

    Label l1,l2;

    l1=new Label("SVVV");
    l1.setBounds(125,100, 80,80);

    l2=new Label("SVIIT");
    l2.setBounds(125,150, 80,80);

    f1.add(l1);
    f1.add(l2);

    f1.setSize(300,350);
    f1.setLayout(null);
    f1.setVisible(true);
	f1.addWindowListener(new myclass());
}
}
class myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
