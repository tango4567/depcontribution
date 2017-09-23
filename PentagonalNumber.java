/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */

package deepak;

/**
 *
 * @author ultra
 */
import java.util.Scanner;
public class PentagonalNumber {
public static void main(String[] args) {
   		int count = 1;
		for(int i = 1; i <= 50; i++){
			System.out.print(getPentagonalNumber(i)+" ");
			if(count % 10 == 0) System.out.println();
			count++;
		}
    }
  public static int getPentagonalNumber(int i) {
		return (i * (3 * i - 1))/2;
	}
}
    

