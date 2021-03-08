import java.applet.*;
import java.awt.*;
//<APPLET code = "Printfun"  width = "1000" height = "200"> </APPLET>

public class Printfun extends Applet{

  public void paint(Graphics g){
    g.drawString("HELLO, IT's an implementation of the method paint() of class APPLET. in paint(), we will call the drawString()" ,200 ,100);

  }
}
