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
public class UpperCaseString {
    public static void main(String[] args) {
       
      
        
        
        
        String orignalString="";
//        String name="saif";
//        String name1=new String("saif");
//       String sat= orignalString.toUpperCase();
//        System.out.println(sat);
//        System.out.println(orignalString);
//       if(orignalString==name){
//            System.out.println("true");
//        }else{System.out.println("false");}
//         if(orignalString.equals(name)){
//            System.out.println("true");
//        }else{System.out.println("false");}
//          if(orignalString.equals(name1)){
//            System.out.println("true");
//        }else{System.out.println("false");}
     
        Scanner scanner=new Scanner(System.in);
        orignalString=scanner.next();
        char array[] = orignalString.toCharArray();
        int space[]=new int[20];
        for(int i=0;i<array.length;i++){
            if(array[i]=='_'){
                array[i+1]=Character.toUpperCase(array[i+1]);
            }
        }
        String newString=new String(array);
        System.out.println(newString);
   
    
    }
  
}
