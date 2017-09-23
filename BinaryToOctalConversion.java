

import java.util.Scanner;
import java.math.*;

public class BinaryToOctalConversion
{
    static int a;
    static int p=0,decimalNumber=0,i=0;
 //   static int octalNumber=0;
    static int oct_num[] = new int[20]; 
public static void main(String ar[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the any binary number ");
int a=input.nextInt();
//int p=0,decimalNumber=0;
  
     binaryToDecimal(a);
     System.out.println("decimal "+decimalNumber);
     DecimalToOctal(decimalNumber);

   // System.out.println(octalNumber);
}
  
public static void DecimalToOctal(int decimalNumber)
{
   
    a=decimalNumber;
    
while(a!=0) {
            oct_num[i] = a%8;
            a = a/8;
            i++;
        }
	 //  System.out.println("i= "+3);	
        for(int j=i-1; j>=0; j--)
        {
            
            System.out.print(oct_num[j]);
        
        }
        

//System.out.print("Octal number is: ");
    
    }
public static void binaryToDecimal(int a){
  //int p=0;
  //int decimalNumber = 0;
while(a!=0)
{
     decimalNumber=(int)((a%10)*Math.pow(2, p)+decimalNumber);
     p++;
     a=a/10;
  
}
    System.out.println(decimalNumber);
 }


 
}
    

 