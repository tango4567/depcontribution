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
interface OuterInterface{
static int a=24,b=23;
static interface InnerInterface{
    void add();
    static interface InnerInterface2{
        void sub();
    }
}
}
class test implements OuterInterface
{
static void add()
{
int c =a+b;
    System.out.println(a+" and "+b+" Addition is "+c);
}
static void sub()
{
int c=a-b;
    System.out.println(a+" and "+b+" Subtraction is "+c);
}
}
public class NestedInterface extends test{
    public static void main(String[] args) {
        add();
        sub();
        
    }
   
    
}
