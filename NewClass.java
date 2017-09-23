/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;


import java.util.Scanner;

/**
 *
 * @author ultra
 */
public class NewClass {
    public static void main(String[] args) {
        int a=10,b=0,c=0;
        try{c=a/b;
        System.out.println(c);
        }
         catch(ArrayIndexOutOfBoundsException e)
        {System.out.println("arrrayIn");
        }
       
        catch(ArithmeticException e1){
            
        }
        catch(NumberFormatException e){System.out.println("Namber format");}
        catch(Exception e){System.out.println(a+b);}
    
        System.out.println("program excuted");
        
    }
   
}
