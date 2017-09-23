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
public class MiddileNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value ");
        int a =obj.nextInt();
        int i=0;
        int array[] = new int [5]; 
        while(a>0)
        {
            int temp = a%10;
            a=a/10;
           array[i]= temp;
            i++;
        }
        int mid = (array.length)/2;
        System.out.println(array[mid]);
        
    }
    
}
