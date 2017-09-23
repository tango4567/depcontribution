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
public class Queqe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of Queqe : ");
        int size = input.nextInt();        
        int queqe[] = new int[size];
        int rear=0,front=0;
        System.out.println("Welcome to Queqe program ");
        int choise=0;
        do{
            System.out.println("\n1.Push..");
            System.out.println("2.Pop..");
            System.out.println("3.Display..");
            System.out.println("4.Exit..");
            System.out.print("Please Enter the choise. : ");
            choise =input.nextInt();
            
            switch(choise){
                case 1:
                {
                    if(rear==size)
                    {                         
                        System.out.println("Queqe is overflow");
                    } else {
                        int num=0;
                        System.out.print("Enter the element : ");
                        num = input.nextInt();
                        queqe[rear]=num;
                        if(front==-1){front=0;}
                        System.out.println("Enter your element : "+queqe[rear]);
                        rear++;
                    }
                    break;
                }
                case 2:
                {
                    if(front==rear)
                    {
                        System.out.println("Queqe is underflow ");
                    }
                    else
                    {
                        int data=0;
                        data = queqe[front];
                        if(front==rear){front=0;rear=-1;
                        }else{
                        front = front +1;
                        System.out.println("Delete your element is : "+data);
                    }
                
                    break;
                }
                }
                case 3:
                {
                    System.out.println("Your Queqe element is : ");
                    for(int i=front;i<rear;i++)
                    {
                        System.out.println(queqe[i]);
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Your Exit in Queqe ");
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Your wrong choise please again choise ");
                }
                
            }
        }while(choise>0);
        
        
    }
}