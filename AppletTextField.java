import java.awt.*;
import java.applet.*;

//<APPLET code = "AppletTextField" width="500" height= "300"> </APPLET>
public class AppletTextField extends Applet {
      TextField t1 = new TextField("PUT YOUR Comments here", 50);
      TextField t2 = new TextField( );

        public void init(){
          add(t1);
          t2.setText("HELLOOO");
          t2.setEditable(false);
          add(t2);
        }

          public void paint(Graphics g){

            g.drawString("Result: "+t1.getText(),50, 50);
}
}
