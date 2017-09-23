import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class ioPackBuffer
{
public static void main(String ar[]){

String s="Deepak patidar mahetwada";
byte arr[] =s.getBytes();
try{
FileOutputStream fout = new FileOutputStream("d:\\javad\\deepak.txt");
BufferedOutputStream bos = new BufferedOutputStream(fout);
bos.write(arr);
bos.close();
bos.flush();
fout.close();
System.out.println("success..");
}catch(Exception e){System.out.println(e);};
}
}