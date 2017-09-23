import java.util.Scanner;
public class prime
{
	public static void main(String ar[])
	{
		int i,m=0,flag=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the check number ");
		int n = input.nextInt();
		m=n/2;
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println("it's not prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("it's prime number");
		}
		}
	}
