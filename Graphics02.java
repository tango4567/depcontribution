/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepak;

import java.awt.*;
import java.applet.*;
/**
 *
 * @author ultra
 */
public class Graphics02 extends Applet{
@Override
public void paint(Graphics gr){
    String creatname ="Deepak patidar";
    for(int i=1;i<1000;i++){
    gr.drawLine(10,620,1000,620);//Road
    gr.drawString(creatname,355,645);//name
    gr.drawRect(25+i,470,205+i,105);//trak
    gr.drawRect(230+i,450,115+i,125);//trak
    gr.drawOval(80+i, 577, 40, 40);//will1
    gr.drawOval(270+i, 577, 40, 40);//will2
        
    }
}
    
}
