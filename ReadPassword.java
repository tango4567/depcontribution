import java.io.Console;
class ReadPassword{
public static void main(String ar[]){
Console c =System.console();
System.out.println("ENTER PASSWORD");
char[] p=c.readPassword();
String pass=String.valueOf(p);
System.out.println("Password is "+ pass);
} 
}