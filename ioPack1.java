import java.io.FileInputStream;
public class ioPack1
{
public static void main(String ar[]){


try{
FileInputStream fin = new FileInputStream("d:\\javad\\deepak.txt");

System.out.println(fin.available());
int i=0;
for(;i>-1;){
i=fin.read();
System.out.print((char)i);}
fin.close();
}catch(Exception e){System.out.println(e);};

}
}