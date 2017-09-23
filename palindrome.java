import java.util.Scanner;
class palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp, n=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter a Number");
n=in.nextInt();    
temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
   //System.out.print("Enter your name: ");

    
   // String username = in.next();

}  
}  