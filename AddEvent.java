import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class AddEvent extends Frame {
public void init(){
 this.setSize(300,300);
Label l = new Label("Enter name");
l.setBounds(100,200,100,30);
TextField tf = new TextField("");

tf.setBounds(150,200,150,30);
Button ok=new Button("Click me");
 ok.setBounds(150,300,70,40);  
ok.setBackground(Color.yellow);
ok.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
System.out.println(tf.getText());
tf.setText("");
}
});
this.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent evt ){
System.exit(0);
}
});
tf.addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent me){
System.out.println("Enter Your Name");
}
});
setBackground(Color.red);
 this.setLayout(null);
this.add(l);
this.add(ok);
this.add(tf);
this.setVisible(true);
}

public static void main(String ar[]){
AddEvent ae=new AddEvent();
ae.init();
}

}