import java.util.Scanner;
public class BibonacciNum
{
	public static void main(String ar[])
	{
		Scanner input = new Scanner(System.in);
		int n1=0,n2=1,n3=0;
		System.out.println("Enter the any value ");
		int num = input.nextInt();
		System.out.print(n1+","+n2);
		for(int i=3;i<=num;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(","+n3);
		}
	}
}