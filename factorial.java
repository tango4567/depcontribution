import java.util.Scanner;
public class factorial
{
	public static void main(String ar[])
	{
		Scanner input = new Scanner(System.in);
		int fact=1;
		System.out.println("Enter the value of facter ");
		int num = input.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
            System.out.print(i+"*");
		}
		System.out.println("");
		System.out.println("facter value is "+fact);
	}
}