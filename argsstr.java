import java.util.Scanner;
public class argsstr
{
  public static void main(String args[])
  {
     Scanner input = new Scanner(System.in);
    
   for(int j=0;j<args.length;j++)
      {
       System.out.println(args[j]);
    }
  }
}