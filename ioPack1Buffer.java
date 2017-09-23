import java.io.FileInputStream;
import java.io.BufferedInputStream;
public class ioPack1Buffer
{
public static void main(String ar[]){


try{
FileInputStream fin = new FileInputStream("d:\\javad\\deepak.txt");
FileInputStream fin = new FileInputStream("d:\\javad\\deepak1.txt");
BufferedInputStream bin = new BufferedInputStream(fin);
System.out.println(bin.available());
int i=0;
while((i=bin.read())>-1){
System.out.print((char)i);}
bin.close();
fin.close();
}catch(Exception e){System.out.println(e);};

}
}