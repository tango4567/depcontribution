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
public class Stack {
    public static char ans;
    public static int top = 0,i,a=0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of Stack ");
        int num = input.nextInt();
        int []stack = new int[num];
       
        System.out.println("Welcome to Stack program..");
        do{
            System.out.println("");
            System.out.println("1.push..");
            System.out.println("2.pop..");
            System.out.println("3.display..");
            System.out.println("4.exit");
            System.out.print("Enter your choise : ");
            int choise =0;
            choise = input.nextInt();
            switch(choise){
                case 1:{
                   
                    if(top==num){
                        System.out.println("stack is overflow ");
                        break;
                        
                    }
                    else {
                    int value=0;
                        value = input.nextInt();
                        stack[top]=value;                        
                        System.out.print("push your element : ");
                        System.out.println(stack[top]); 
                    }
                    top++;
                    break;
                }
                case 2:{
                   if(top==0){
                       System.out.println("stack is underflow ");
                       
                   }
                   else{
                       top--;
                       System.out.println("your pop elemnt is "+stack[top]);
                       
                        break;
                       }
                   break;
                }
                case 3:{
                    System.out.println("your stack element is ");
                    for(i=0;i<top;i++)
                        {
                            System.out.println(stack[i]);
                        }
                    break;
                }
                case 4:
                {
                    System.out.println("your exit in stack ");
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("enter your wrong choise");
                }
                 }
        }while(ans!='n');
    }    
}

