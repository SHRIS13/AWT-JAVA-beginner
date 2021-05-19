    /*Java Program to Change Look and Feel*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
 
class GuiLook implements ItemListener
{
    JFrame f;   JLabel l;
    JRadioButton radio[];

    UIManager.LookAndFeelInfo looks[]=UIManager.getInstalledLookAndFeels();
    String UI_Names[]={"Metallic GUI","Windows GUI","Motif GUI"};



        GuiLook()
         {
      
	        f=new JFrame("Change Look & Feel");
        	f.setSize(500,500);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setLayout(null);
	
        	l=new JLabel();
	        l.setBounds(150,50,500,50);	

	        f.add(l);
	
        	ButtonGroup group=new ButtonGroup();
	        radio=new JRadioButton[3];
	            for(int i=0;i<3;i++)
	                {
	                  radio[i]=new JRadioButton(UI_Names[i]);
	                  radio[i].addItemListener(this);
	                  radio[i].setBounds(i*200,100,100,100);
	                  group.add(radio[i]);
	                  f.add(radio[i]);
                	}
	
        l.setText("This is Metal Look & Feel");
	    radio[0].setSelected(true);
	
        f.setVisible(true);
        }
   
         public void changeLookAndFeel(int i)
             {
                try
	            {
	                   l.setText("This "+UI_Names[i]+" is selected Look & Feel GUI");
	                    UIManager.setLookAndFeel(looks[i].getClassName());
    	                 SwingUtilities.updateComponentTreeUI(f);
    	        }
    	        catch (Exception e)
            	{
    	            System.out.println("Error. UI Not Found in System");
    	        }
             }
    
         public void itemStateChanged(ItemEvent e)
            {
                 for(int i=0;i<3;i++)
            	{
	                if(radio[i].isSelected())
	                {
	                changeLookAndFeel(i);
	            	break;
	              }
        	}
      }
    
        public static void main(String args[])
         {
               GuiLook gui=new GuiLook();
          }
}