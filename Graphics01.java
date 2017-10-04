/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepak;

/**
 *
 * @author ultra
 */


import java.awt.*;
import java.applet.*;
public class Graphics01 extends Applet{
      @Override
      public  void paint(Graphics g) {
        String Deepak = "ram";
        g.setColor(Color.DARK_GRAY);
         
        g.fillRect(50,50,850,600);
        g.setColor(Color.red);
       g.fillArc(430,420,100,100,180,180);//inner mouth
        g.drawOval(303,203,350,350);//  head 
        g.fillOval(460,380,30,30);//center nose
        g.setColor(Color.green);
        g.drawOval(330,303,60,60); //left eyes
        g.drawOval(565,303,60,60); //Right eyes
        g.setColor(Color.magenta);
        g.fillOval(340,318,40,30);//inner eyes
        g.fillOval(575,318,40,30);//outer eyes
        g.setColor(Color.yellow);
        g.drawOval(445,368,60,60);//outer nosh
        g.setColor(Color.orange);
        g.drawArc(245,293,90,90,410,240); //Left hear
        g.drawArc(625,293,90,90,248,250); //rigth hear
        g.setColor(Color.pink);
        g.drawArc(400,390,155,150,180,180);// maoth
       
      }
}
