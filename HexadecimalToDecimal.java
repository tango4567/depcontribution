/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;

/**
 *
 * @author ultra
 */
import java.util.Scanner;
import java.math.*;
public class HexadecimalToDecimal implements prectice{
    public static void main(String ar[]){
    final int c=10;
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the any octal number ");
    int a=input.nextInt();
    int p=0;
    int decimalNumber=0;
    while(a!=0){
        decimalNumber=(int)((a%10)*Math.pow(16, p)+decimalNumber);
        p++;
        a=a/10;
        
    }
        System.out.println(decimalNumber);
        /*void add();*/
        
        System.out.println(prectice.a);      
        
    
    }

    /**
     *
     */
    @Override
    public void add() {
         
         //System.out.println(prectice.a);
    }
    
}
