import java.util.Scanner;
public class EvenOdd
{
	public static void main(String ar[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the any number ");
		int num = input.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is even number");
		}
		else
		{
			System.out.println(num+" is odd number");
		}
	}
}