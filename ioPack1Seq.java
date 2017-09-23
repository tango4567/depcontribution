import java.io.*;
public class ioPack1Seq
{
public static void main(String ar[]){
try{
FileInputStream fin = new FileInputStream("d:\\javad\\deepak.txt");
FileInputStream fin1 = new FileInputStream("d:\\javad\\deepak1.txt");
FileInputStream fin3 = new FileInputStream("d:\\javad\\deepak2.txt");
//SequenceInputStream sis = new SequenceInputStream(fin1,fin);
//FileOutputStream fin2 = new FileOutputStream("d:\\javad\\deepak2.txt");
int i=0;
for(;i>-1;){
i=fin3.read();
//fin2.write(i);
System.out.print((char)i);
}
fin3.reset();
fin3.close();
fin.close();
fin1.close();
//sis.close();

}catch(Exception e){System.out.println(e);};

}
}