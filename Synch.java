/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;

class Callme 
{
synchronized void call(String msg)
{
System.out.println("[" + msg);
try{
Thread.sleep(1000);
}
catch(Exception e){
System.out.println(e);
}
System.out.println("]");
}
}

class Caller implements Runnable
{
String msg;
Callme target;
Thread t;

    @Override
    public void run() {
       target.call(msg);
    }
public Caller(Callme targ, String s)
{
target = targ;
msg =s;
t = new Thread(this);
t.start();
}
}



public class Synch
{
public static void main(String ar[])
{
Callme target =new Callme();
Caller obj1 = new Caller(target , "Hello");
Caller obj2 = new Caller(target , "synchronized");
Caller obj3 = new Caller(target , "World");

try{
obj1.t.join();
obj1.t.join();
obj1.t.join();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

