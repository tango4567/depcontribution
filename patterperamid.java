public class patterperamid
{
  public static void main(String ar[])
  {
   for(int i=1;i<10;i++)
  {
   for(int j=1;j<i;j++)
   {
    if(i==1||j==2||i==10||j==1||j==i)
   {
     System.out.print("*");
   } 

else
{
System.out.print("");
}
   }
  }
 }
}