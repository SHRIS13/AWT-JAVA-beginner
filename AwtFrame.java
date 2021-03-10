import java.awt.*;
import java.awt.event.*;
class AwtFrame extends Frame
{
   public static void main(String args[])
   {

    AwtFrame f= new AwtFrame();
    f.setVisible(true);
    f.setSize(200,300);
    f.setTitle("My Awt Frame ");
	f.addWindowListener(new myclass());
   }
}
class myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
