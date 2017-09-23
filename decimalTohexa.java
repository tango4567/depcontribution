import java.util.Scanner;
public class decimalTohexa
{
public static void main(String ar[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the any decimal value ");
int a=input.nextInt();
int b[]= new int [15];
int i=0;
while(a!=0)
 {
  b[i]=a%16;
   a=a/16;
i++;
 }
for(int j=i-1;j>=0;j--)
{
System.out.print(b[j]);
}
}
}