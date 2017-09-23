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
public class PasswardValid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.A password must have at least ten characters.");
        System.out.println("2.A password consists of only letters and digits.");
        System.out.println("3.A password must contain at least two digits.");        
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.) : ");
        String ar = input.next();
        char array[] =ar.toCharArray();
       boolean flag=false;
        for(int i=0;i<array.length;i++)
        {
                        if(Character.isLetterOrDigit(array[i]))
            {
               flag=true;
            }          
            }
          if(flag){
              System.out.println("valid");
          
          }else{System.out.println("invalid");}
        }
        
    }
    

