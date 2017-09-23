import java.applet.*;
import java.awt.*;
/*<applet code="Gui1.class" width="500" height="500">

</applet>*/

public class Gui1 extends Applet
{
    public void paint(Graphics g)
{
int x[]={100,50,150};
int y[]={100,200,200};
g.setColor(Color.green);
g.drawString("bdnam",100,100);
g.setColor(Color.red);
g.drawLine(100,100,200,200);
//g.drawOval(100,100,50,100);
g.fillOval(200,200,100,30);
g.fillRect(150,150,30,100);
g.drawPolygon(x,y,3);
}


}
