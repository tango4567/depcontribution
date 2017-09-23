/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepak;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author ultra
 */
public class PallindromeString {

    public static void main(String[] args) {
        String orignalString = "";
        Scanner s = new Scanner(System.in);
        orignalString = s.next();
        char temparray[] = orignalString.toCharArray();
        // System.out.println(temparray.length);
        char reversArray[] = new char[20];
        for (int i = 0; i <= temparray.length - 1; i++) {
            reversArray[(temparray.length - 1) - i] = temparray[i];
        }
//        for(int j=0;j<=reversArray.length-1;j++){
//            System.out.print(reversArray[j]);
//        }
        String reversString = new String(temparray);
        if (orignalString.equalsIgnoreCase(reversString)) {
            System.out.println("String is plindrome.");
        } else {
            System.out.println("string is not a plindrome string.");
        }
    }
}
