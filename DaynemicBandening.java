/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;


import java.io.IOException;
import java.util.Scanner;
public class DaynemicBandening {
    public static void main(String[] args) throws IOException, InterruptedException {
       int i=0;
       String string[]=new String[20];
        recurtion(i,string);
        //scase(i,string);
       }

    public static void recurtion(int i,String string[]) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        int g=4;
        int a=0;
        System.out.println("Please select your choise");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Divition");
        
        for(a=0;a<=i;a++){
            if(a!=0)
            {
                System.out.println((g+a-1)+"."+string[a-1]);
                
            }
        }
        System.out.print((g+i)+".Add more... : ");
        int num = input.nextInt();
        switch(num)
        {
            case 1:
            {
                System.out.println("Addition");               
                break;
            }
            case 2:
            {
                System.out.println("Substraction");
                break;
            }
            case 3:
            {
                System.out.println("Division");
                break;
            }
            case 4 :
            {
                a=0 ;
     System.out.print("please enter titla : ");
                for(a=i;a<=i;a++)
                {
                    string[i] = input.next();
                }
                i++;  
                recurtion(i,string); 
                             
            }
            default:
            {
                scase(i, string);
            }           
        }   
}
 public static void scase(int i,String string[]) throws IOException, InterruptedException {
     Scanner input = new Scanner(System.in);
     int a=0 ;
     System.out.print("please enter titla : ");
                for(a=i;a<=i;a++)
                {
                    string[i] = input.next();
                }
                i++;
                recurtion(i,string);
                
 }
}