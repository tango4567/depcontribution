import java.applet.*;
import java.awt.*;
/*<applet code="AppletProgram.class" width="500" height="500"></applet>*/
public class AppletProgram extends Applet{
  public void paint(Graphics g){

g.drawOval(180,230,90,80); 
g.drawOval(380,230,90,80);  
g.fillOval(200,260,50,30);
g.fillOval(400,260,50,30);
g.drawOval(290,330,60,50);
g.fillArc(140,260,110,110,90,180); 
g.fillArc(470,370,110,110,100,240);
g.setColor(Color.red);
g.drawOval(150,150,350,334); 
g.fillArc(290,330,60,50,180,180); 
g.fillArc(270,370,100,100,180,180);
}
}