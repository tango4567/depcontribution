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
class Q
{
int n;
boolean valueSet = false;
synchronized int get()
{
    while (!valueSet)
        try{
        wait();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("got : "+n);
        valueSet = false;
        notify();
        return n;
}
synchronized void put(int n)
{
while (valueSet)
        try{
        wait();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        this.n = n;
        valueSet = true;
        System.out.println("put : "+n);
        notify();
}
}
class Producer implements Runnable
{
Q q;

    public Producer(Q q) {
        this.q=q;
        new Thread(this,"producer").start();
    }
@Override
public void run(){
int i=0;
    while (true){
 q.put(i++);
 }
}
}
class Consumer implements Runnable
{
Q q;

    public Consumer(Q q) {
        this.q=q;
        new Thread(this,"Consumer").start();
    }
@Override
public void run(){
 while (true){
 q.get();
 }
}
}
public class InterthreadComunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        
        System.out.println("press control - c to stop ");
    }
    
}
