import java.util.Scanner;
public class Sumtwodigit
{
	public static void main(String ar[])
	{
		Scanner input = new Scanner(System.in);
		int c=0,a,temp;
		System.out.println("Enter the only value 1 to 100 ");
		int num = input.nextInt();
		temp = num;
		    

 			 a=num%10;
			 num=num/10;
			 c=a+num;
			System.out.println("your value Sum is "+num+" + "+a+" = "+c);
			
		 

	}
}