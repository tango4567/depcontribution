/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;

/**
 *s
 * @author ultra
 */
import java.io.IOException;
import java.util.Scanner;
public class QuadraticEquations {
      public static void main(String[] args) throws IOException {
//        int a,b,c,temp;
//        char aad;
//                Scanner input = new Scanner(System.in);
//                System.out.println("enter the cracter");
//                aad=(char) System.in.read();
//                System.out.println(aad);
//                        
//          System.out.println("Enter the first value ");
//        a=input.nextInt();
//          System.out.println("enter the second value ");
//        b=input.nextInt();
//          System.out.println("Enter the thired value ");
//        c=input.nextInt();
//        temp = b*b - 4*a*c;
//        
//        int d = 2*a;
//        
//        double temp1 =(-b) +( Math.pow(temp,0.5));
//        double temp2 =(-b)-(Math.pow(temp,0.5));
//        double x1=temp1/d;
//        double x2=temp2/d;
//        System.out.println("first value is "+x1);
//          System.out.println("second value is "+x2);
        
      String name="saifalikhan",name1="Sa i F";
//           System.out.println(name.endsWith("n"));         
          System.out.println("trim="+name.trim());
          char nam[]=new char[name.length()-1];
         nam= name.toCharArray();
         for(int i=0;i<nam.length;i++)
         {
             System.out.println(nam[i]);
         }
         // System.out.println("isEquals "+name.equalsIgnoreCase(name1));
//          System.out.println(name.replace('a','p'));
//          System.out.println( name.isEmpty());
//          System.out.println(name.charAt(2));
//          char arrr[]=new char[name.length()-1];
//          for(int i=0;i<arrr.length;i++){arrr[i]=name.charAt(i);}
      
//      String Str = new String("this is my string");
//
//      System.out.print("Return Value :" );
     // System.out.println(Str.replaceFirst("(.*)my(.*)", "AMROOD"));

     // System.out.print("Return Value :" );
    //  System.out.println(Str.replaceFirst("my", "AMROOD"));
          String s="56";
          String s1="90";
          int a=Integer.parseInt(s);
          int b=Integer.parseInt(s1);
          System.out.println(s+s1);
          System.out.println(a+b);
      }
}
