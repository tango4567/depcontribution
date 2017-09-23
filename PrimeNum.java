import java.util.Scanner;
public class PrimeNum{
public static void main(String ar[]){
Scanner obj = new Scanner(System.in);
int i=0;
int num=0;
boolean flage=false;
int k=obj.nextInt();   
for(i=1;i<=k;i++)
{
      
 if(i%1==0)
     {   
          if(i==1||i==2)
          {
             System.out.println("prime number is= "+i);
         }
         for(num=2;num<i;num++)
      {
        
           if(i%num==0)
            { 
              flage=false;
               break;
            }else
            {
                       flage=true;
             }
               
       }
 	 				
if(flage==true)
{
System.out.println("prime number is= "+i);
}  
    }    
         
}
}
}



