/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ThrowExample { 
  public static int myMethod()
   {
      try {
        throw new ArithmeticException("svnjmfg");
      }catch(Exception e){System.out.println(e);}
      finally {
        System.out.println("This is Finally block");
        System.out.println("Finally block ran even after return statement");
      }
      return 0;
   } 
  public static void main(String args[]){ 
   
     ThrowExample obj=new ThrowExample(); 
      System.out.println(obj.myMethod()); 
  
      
  }
}

