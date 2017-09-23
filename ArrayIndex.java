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
import com.sun.org.apache.xalan.internal.xsltc.compiler.Constants;
import java.util.Scanner;
public class ArrayIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j=0,k=5;
        int choise;
        int array[]=new int[k];
        do{
            System.out.println("1.insertion \n"
                    + "2.deletion \n"
                    + "3.size change \n"
                    + "4.display \n"
                    );
            choise = input.nextInt();
            switch(choise)
            {
                case 1:
                {
                    System.out.println("Enter your element ");
                    array[j]=input.nextInt();
                    j++;
                    break;
                }
                case 2:
                {
                    j--;
                }
                case 3:
                {
                    System.out.println("your change the array lenth \n"
                            + "your enter the value ");
                    int g=input.nextInt();
                    k=k+g;
                    System.out.println("your array lenth is "+array.length);
                }
                case 4:{
                    System.out.println("your element is");
                    for(int l=0;l<array.length;l++)
                    {
                        System.out.println(array[l]);
                    }
                }
            }
                
                }while(j>0);
    }
    
}
