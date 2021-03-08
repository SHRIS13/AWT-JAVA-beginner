import java.applet.Applet;
import java.awt.*;

//<APPLET code = "AppletCheckbox" width = "200" height = "300"> </APPLET>

public class AppletCheckbox extends Applet{
  Checkbox c1 = new Checkbox("TICK if this program works!!" );
  Checkbox c2 = new Checkbox("TICK if you know core JAVA!!" );
  Checkbox c3 = new Checkbox("TICK if you study in SVIIT!!" );
    public void init(){
      c1.setState(true);

      
    add(c1);
    add(c2);
    add(c3);
    }
}
