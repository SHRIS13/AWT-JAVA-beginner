import java.applet.*;
import java.awt.*;

//<applet code = "AppletRadioButton" width = "300" height = "300">  </applet>

public class AppletRadioButton extends Applet{

  CheckboxGroup cg = new CheckboxGroup();
  Checkbox c1 = new Checkbox("TICK if this program works!!" , cg, false );
  Checkbox c2 = new Checkbox("TICK if you know core JAVA!!" ,cg, false );
  Checkbox c3 = new Checkbox("TICK if you study in SVIIT!!" ,cg, false);
    public void init(){
      c1.setState(true);


    add(c1);
    add(c2);
    add(c3);
    }
}
