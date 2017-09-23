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
class Thread1 extends Thread{
public void run(){
for(int i=0;i<=3;i++){
    System.out.println("Tread1 i= "+i);
}

}
}
class Thread2 extends Thread{
public void run(){
for(int j=0;j<=3;j++){
    System.out.println("Tread2 j= "+j);
}

}
}class Thread3 extends Thread{
public void run(){
for(int k=0;k<=3;k++){
    System.out.println("Tread3 k= "+k);
}

}
}
public class ExampleOfThreds {
    public static void main(String[] args) throws InterruptedException {
       Thread1 thread1=new Thread1();
       Thread2 thread2=new Thread2();
       Thread3 thread3=new Thread3();
       
       thread1.start();
       thread1.sleep(1000);
        System.out.println("thread3 "+thread3.getId());
       thread2.start();
        thread1.join();
       thread3.start();
        System.out.println("thread2 "+thread2.getId());
        
       
       
    }
    
}
