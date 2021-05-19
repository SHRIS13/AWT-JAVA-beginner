import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class login implements ActionListener
{
	static JTextField name;
	static JPasswordField pwd; 
	static JButton view;
	static JTextField text;
     
        	public static void main(String args[])
            {
	
		        JFrame f=new JFrame("Login");
	        	f.setSize(400,400);
		        f.setLayout(null);
		        f.setBackground(Color.white);
		        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		        JLabel lname=new JLabel("Name :");
		        JLabel lpwd=new JLabel("Password :");
		        lname.setBounds(50,50,50,50);
		        lpwd.setBounds(20,100,80,50);
		        f.add(lname);
		        f.add(lpwd);
		
		        name=new JTextField();
		        pwd=new JPasswordField();
		        name.setBounds(100,50,250,50);
		        pwd.setBounds(100,100,250,50);
		        f.add(name);
	        	f.add(pwd);
		
		        view=new JButton("View");
		        view.setBounds(150,200,100,50);
		        f.add(view);
		
		        text=new JTextField();
		        text.setBounds(0,250,400,50);
		        f.add(text);
		
		        login ln=new login();

	        	view.addActionListener(ln);
		
	        	f.setVisible(true);
	        }
        
	public void actionPerformed(ActionEvent e)
	    {
	    	String pass=String.valueOf(pwd.getPassword());
	    	text.setText("Username = "+name.getText());
	    	text.setText(text.getText()+" Password = "+pass);
	    }
}