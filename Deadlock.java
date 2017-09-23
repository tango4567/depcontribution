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
public class Deadlock extends Thread{
    final static String ar1="Thread 1";
    final static String ar2="Thread 2";
    public static void main(String[] args) {
        Thread t1 = new Thread(){
        public void run(){
            synchronized(ar1){                                                    
        System.out.println(ar1);  
        synchronized(ar2){
            System.out.println("Thread is lock 1");
        }      
        }
        }
        };             
        Thread t2 = new Thread(){
        public void run(){
        synchronized(ar1){
        System.out.println(ar1);  
        synchronized(ar2){
        System.out.println("Thread is lock 2");
        }
        }
        }
        };
        t1.start();
        t2.start();
    }
    
}
