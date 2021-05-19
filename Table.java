import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public class Table extends JFrame
{
    public Table()
    {
        String[] column = new String[] {
            "S.No.", "Name", "Place", "Animal", "Thing"
        };
        Object[][] detail = new Object[][] {
            {01, "Ritika", "Rajisthan", "Rabbit","Roof" },
            {02, "Akansha", "Amazon", "Ant","Apple" },
            {03, "Bhumika", "Barcelona", "Bee","Banana" },
			{04, "Chirag", "Chile", "Camel", "Carpet" },
            {05, "James", "Japan", "Jaguar", "Jet" },
        };
        JTable table = new JTable(detail, column);
        this.add(new JScrollPane(table));
         
        this.setTitle("Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Table();
            }
        });
    }
}	