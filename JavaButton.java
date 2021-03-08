import java.applet.Applet;
import java.awt.Button;
 //<APPLET code="JavaButton" width=200 height=200> </APPLET>

public class JavaButton extends Applet{
    public void init(){

          Button b1 = new Button("Applet Button 1");
          Button b2 = new Button();
          b2.setLabel("APPLET Button 2");

          add(b2);
 }

}
