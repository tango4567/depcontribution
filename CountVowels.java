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
public class CountVowels {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the any String ");
        String input = obj.next();
        int i=0;
        char ar[]=input.toCharArray();
        int a=0,b=0;
        int c=0;
        for(i=0;i<ar.length;i++)
        { 
            if(ar[i]=='A'||ar[i]=='E'||ar[i]=='I'||ar[i]=='O'||ar[i]=='U')
            {
                a++;
            }
            else
            {
                b++;
            }
            c++;
        }
        System.out.println("Your String Vowel is is "+a);
        System.out.println("Your String constecter is "+b);
        System.out.println("Your string all Wards is "+c);
    }
}
