/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;



public  class MyException extends Exception{
   MyException(String ar)
   {
      super(ar);
   }
void massage(){
    System.out.println("this my own exception");
      
}
}

