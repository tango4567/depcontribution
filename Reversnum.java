import java.util.Scanner;
public class Reversnum
{
	public static void main(String ar[])
	{
		Scanner input = new Scanner(System.in);
		int c=0,a=0;
		System.out.println("Enter the any value ");
		int num = input.nextInt();
		System.out.print("Your enter value is "+num+" and revers value is ");
		 while(num>0)
		 {
			 a=num%10;
			 num=num/10;
             //c=c*(a+num);
             System.out.print(a);
		 }
		 
       
	}
}