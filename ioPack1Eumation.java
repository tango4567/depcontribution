import java.io.*;
import java.util.*;
public class ioPack1Eumation
{
public static void main(String ar[]){
try{
FileInputStream fin = new FileInputStream("d:\\javad\\deepak.txt");
FileInputStream fin1 = new FileInputStream("d:\\javad\\deepak1.txt");
FileInputStream fin2 = new FileInputStream("d:\\javad\\deepak2.txt");
Vector v=new Vector();    
v.add(fin);    
v.add(fin1);    
v.add(fin2);
Enumeration e=v.elements();
SequenceInputStream sis = new SequenceInputStream(e);
//FileOutputStream fin2 = new FileOutputStream("d:\\javad\\deepak2.txt");
int i=0;
for(;i>-1;){
i=sis.read();
//fin2.write(i);
System.out.print((char)i);
}

fin2.close();
fin.close();
fin1.close();
sis.close();

}catch(Exception e){System.out.println(e);};

}
}