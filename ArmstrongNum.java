import java.util.Scanner;
public class ArmstrongNum
{

	public static void main(String ar[])
	{
		Scanner input = new Scanner(System.in);
		int c=0,a,temp;
		System.out.println("Enter the any value ");
		int num = input.nextInt();
		temp = num;
		 while(num>0)
		 {
			 a=num%10;
			 num=num/10;
			 c=c+(a*a*a);
			
		 }  {
                                           int c=10;
                                           System.out.println(c);
                                          }
		 if(temp==c)
		 {
			 System.out.println(temp+" Armstrong number ");
		 } 
		 else 
		 {
			 System.out.println(temp+" not Armstrong number ");
		 }
	
       }

}
