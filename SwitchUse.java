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
import java.awt.BorderLayout;
import java.util.Scanner;
public class SwitchUse {
    public static String choise;
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int i=0;
       String ar ="";
       switchc(ar);   
       
    }
    public static String switchc(String choise){
   System.out.println("please select your choise ");
    Scanner obj = new Scanner(System.in);
    int i=4;
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Divition");
        System.out.println(i+"."+choise);
        System.out.println((i+1)+".Add any more");
        int num = obj.nextInt(); 
        switch(num)
        {
            case 1:
            {
                System.out.println("Addition");
            }
            case 2:
            {
                System.out.println("substraction");
            }
            case 3:
            {
                System.out.println("Divition");
            }
            case 4:
            {
                System.out.println("please enter tital");
                choise = obj.next();
                switchc(choise);
                
            }
        }
        return null;
    }
}