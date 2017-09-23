public class pattern
{
   public static void main(String ar[])
    {
       int revrse=0;     
   for(int i=1;i<=9;i++)
        {
          if(i%2==1)
         {
          for(int j=i;j>=1;j--)
          { 
            System.out.print("*");
               
          } 
System.out.println("");


}  
    revrse=i;      
        }
       for(int k=revrse-1;k>=1;k--)
      { 
     if(k%2==1)
     { 
     for(int l=k;l>=1;l--)
{
System.out.print("*");
}
System.out.println("");
     }
       }
    }
}