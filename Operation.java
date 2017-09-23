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
public class Operation {
   static double c;
   public static void add(int a,int b){
        c=a+b;
        System.out.println("int argument"+c);   
    }
   public static void add(float a,int b){
        c=(int)(a+b);
        System.out.println("float and int  argument"+c);   
    }
   public static void add(int a,float b){
        c=(int) (a+b);
        System.out.println("int and fload argument"+c);   
    }
   public static void add(float a,float b){
        c=(int)(a+b);
        System.out.println("fload argument"+c);   
    }
   public static void mult(int a,int b){
        c=a*b;
        System.out.println("int argument"+c);   
    }
   public static void mult(float a,int b){
        c=(int)(a*b);
        System.out.println("float and int  argument"+c);   
    }
   public static void mult(int a,float b){
        c=(int) (a*b);
        System.out.println("int and fload argument"+c);   
    }
   public static void mult(float a,float b){
        c=(int)(a*b);
        System.out.println("fload argument"+c);   
    }
    
}
