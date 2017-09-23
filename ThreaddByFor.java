/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;


import static deepak.CommonClass.*;
import static deepak.KBCGame.input;
import static deepak.ThreaddByFor.kbcTimer;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ultra
 */
class Timer extends Thread
{
public void run ()
{String ar[] = {q1, q2, q3, q4, q5};
    for(int i=0;i<10;i++){
    
             System.out.println(ar[i]+"  ");
              kbcTimer(i);
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex);//Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
        }
     
 
 }
}
}
public class ThreaddByFor {
    public static void main(String[] args) throws InterruptedException {

        Timer obj = new Timer();
 
        for(int i=0;i<5;i++){
               obj.run();
            
     
    }
    }
    public static void kbcTimer(int i)
    {
    switch (i) {
                case 0:
                    
                    for(int oi=0; oi<_1Option.length-1;oi++){
                        System.out.println(_1Option[oi]);
                    }
                    System.out.print(enter_ans);
                    
                    int userInput = input.nextInt();                    
                    if (_1Option[4].equals(String.valueOf(userInput))) {
                        System.out.println("true");
                    } else {
                        System.out.println(pls_select);
                    }
                
                    
                    break;
                case 1:
                    for(int oi=0; oi<_2Option.length-1;oi++){
                        System.out.println(_2Option[oi]);
                    }
                   System.out.print(enter_ans);
                    int userInput1 = input.nextInt();
                    if (_2Option[4].equals(String.valueOf(userInput1))) {
                        System.out.println("true");
                    } else {
                        System.out.println(pls_select);
                    }
                    break;
                case 2:
                    for(int oi=0; oi<_3Option.length-1;oi++){
                        System.out.println(_3Option[oi]);
                    }
                    System.out.print(pls_select);
                    int userInput2 = input.nextInt();
                    if (_3Option[4].equals(String.valueOf(userInput2))) {
                        System.out.println("true");
                    } else {
                        System.out.println(pls_select);
                    }
                    break;
                case 3:
                    for(int oi=0; oi<_4Option.length-1;oi++){
                        System.out.println(_4Option[oi]);
                    }
                   System.out.print(enter_ans);
                    int userInput3 = input.nextInt();
                    if (_4Option[4].equals(String.valueOf(userInput3))) {
                        System.out.println("true");
                    } else {
                       System.out.println(pls_select);
                    }
                    break;
                case 4:
                    for(int oi=0; oi<_5Option.length-1;oi++){
                        System.out.println(_5Option[oi]);
                    }
                   System.out.print(enter_ans);
                    int userInput4 = input.nextInt();
                    if (_5Option[4].equals(String.valueOf(userInput4))) {
                        System.out.println("true");
                    } else {
                        System.out.println(pls_select);
                    }
                    break;
                default:
                    System.out.println(pls_select);
                    break;
            }
        }
}
