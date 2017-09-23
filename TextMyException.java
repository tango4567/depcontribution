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
public class TextMyException {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        try{
            int b,c;
            b = obj.nextInt();
            c = obj.nextInt();
           if(c==0)
            {
             throw new MyException("main class");
            }
            int a=b/c;
            
            
        }
        catch(ArithmeticException e){
           
             System.out.println(e.getMessage());
              System.out.println(" my Exception run");
        } catch (MyException ex) {
            System.out.println(10);
        }
        finally{
            System.out.println("finally is hendal");
        }
    }
    
}
