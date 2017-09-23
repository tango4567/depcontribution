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
public class pattern1 {
    public static void main(String[] args) {
       for(int i=1;i<=10;i++){
       
           if(i==1||i==3||i==2){
        for(int k=2;k<=5;k++){
           
            System.out.print("    *");
        }
        
        } System.out.println("    *");
           
       }for(int p=1;p<=5;p++){
//          System.out.print("* ");
          if(p==1){System.out.print("  ");
         }else{
           System.out.print("* ");}
       }System.out.println("");
       
       for(int p=1;p<=6;p++){
           System.out.print("* ");
       }
    }

}
