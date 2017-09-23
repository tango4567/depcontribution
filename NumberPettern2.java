import java.util.Scanner;
public class NumberPettern2 {

  public static void main(String[] args)
{
   int i,j,n,s,x;
   System.out.print ("Input number of rows : ");
   Scanner in = new Scanner(System.in);
		    n = in.nextInt();

   s=n	;
    for(i=1;i<=n;i++)
   {
   for(x=s;x!=0;x--)
    {
   System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
if(i==1||j==1||i==5||i==j)    
{ System.out.print("* ");}else{System.out.print("  ");}
     }
	System.out.println();
    s--;
   }
  int s1=n	;
    for(i=1;i<=n;i++)
   {
    for(x=0;x!=s1;x++)
    {
   System.out.print(" ");
    
}
    for(j=i;j>=n;j--)
    {
     if(j==5||i==5||i==j)    
{ System.out.print("* ");}else{System.out.print("  ");}

     }
	System.out.println();
    s1++;
   }   
}
}
 }
}                                                                                     