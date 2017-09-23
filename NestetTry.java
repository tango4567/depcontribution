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
public class NestetTry {
    private static int c=0;
   public static void main(String args[]){  
  try{  
    try{  
     System.out.println("going to divide");  
     int c=0;
     int b =39/c;  
    }catch(ArithmeticException e){System.out.println(e);}  
   
    try{  
    int a[]=new int[5];  
    a[5]=4;  
    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
     
    System.out.println("other statement");  
    try{
        if(c==0)
        {
            throw new MyException("try catch is not bad contend ");    
        }
        
    }
    catch(MyException e){
        System.out.println(e);
        System.out.println("MyException handeled");
    }
  }catch(Exception e){System.out.println("handeled");}  
  
  System.out.println("normal flow..");  
 }  

    
}    

