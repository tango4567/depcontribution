import java.util.Scanner;
public class Dividerall
{
	public static void main(String ar[])
	{
		Scanner input = new Scanner(System.in);
		int c=0,a,count=0;
		System.out.println("Enter the value of divider 1 to 100 ");
		int num = input.nextInt();
		
		System.out.println("Enter the value divide ex. 2,3,5,6,9,12");
		c = input.nextInt();
		
		
		for(a=1;a<=num;a++)
		{
			
			if(a%c==0)
			{
            count++; 
			System.out.println(count+" = "+a);
			}
		}
		System.out.println("total value is a "+count);
	}
}