import java.io.FileOutputStream;
public class ioPack
{
public static void main(String ar[]){

String s="Deepak patidar";
byte arr[] =s.getBytes();
try{
FileOutputStream fout = new FileOutputStream("d:\\javad\\deepak.txt");
fout.write(33);
fout.write(arr);
fout.close();
System.out.println("success..");
}catch(Exception e){System.out.println(e);};
}
}