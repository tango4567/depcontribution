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
import com.sun.jmx.snmp.BerDecoder;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SumOfArray {
     
    public static void main(String ar[]){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the value of array length ");
//        int n=input.nextInt();
//        int temp =0;
//        int array[] = new int[n];
//        System.out.println("Enter the value of an array element");
//        for(int i=0;i<n;i++)
//        {
//        array[i] =input.nextInt();
//        }
//        for(int j=0;j<n;j++)
//        {
//         temp = temp+array[j];
//        }
//        System.out.println("sum of array element is "+temp);
//      
//        int array2[][] = new int[3][3];
//        System.out.println("Enter the value of an array element");
//        for(int j=0;j<3;j++)
//        {
//        for(int k=0;k<3;k++)
//        {
//        array2[j][k]=input.nextInt();
//        }
//        }
//        for(int j=0;j<3;j++)
//        {
//        for(int k=0;k<3;k++)
//        {
//            System.out.print(array2[j][k]+" ");
//        }
//            System.out.print("\n");
//            char a=10;
//            
//        }
//         String a=" ";
//            	System.out.println((int) a.charAt(0) +"ASCII value of  is");
//          //  System.out.println(name.indexOf("f"));
       String ch=null;//"saif ali khan ";   
//       Character a=new Character((char)1);
//        for(int i=35;i<=255;i++){
//                    
//                    ch = new Character((char)i).toString();
//                    System.out.println(ch);
//                                }
        
//        String ch;
//        int i;
//        for(i=1; i<=255; i++)
//        {
//            ch = new Character((char)i).toString();
//            System.out.print(i+ " -> " + ch + "\t");
//        }
//		
//    }
//    StringBuffer sb=new StringBuffer("Hello ");  
//sb.insert(1,"Java");//now original string is changed  
//System.out.println(sb);//prints HJavaello  
//        
//        
//      String str="this is java code";
//      String name="saif";
//      String name1="saif";
//      name1="Ali";
//        System.out.println(name+name1);
//     String p[]=str.split(" ");
//      for(String s:p){
//          System.out.println(s);
//      }
    //Stringbuffer mehtods
       //1 append mehtod 
//       StringBuffer sb=new StringBuffer("Hello ");
//       
//sb.append("{java");//now original string is changed  
//System.out.println(sb);//prints Hello Java  
//2
StringBuffer sb=new StringBuffer("Hello ");  
//sb.insert(1,"Java");//now original string is changed  
//System.out.println(sb);//prints HJavaello 
//3
//sb.replace(1,3,"Java");  
//System.out.println(sb);//prints HJavalo 
//4
//sb.delete(1,3);  
//System.out.println(sb);//prints Hlo  
//5
//sb.reverse();  
//System.out.println(sb);//prints olleH 
//    //6
//System.out.println(sb.capacity());//default 16  
//sb.append("Hello");  
//System.out.println(sb.capacity());//now 16  
//sb.append("java is my favourite language");  
//System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
////7
//StringBuffer sbs=new StringBuffer();  
//System.out.println(sb.capacity());//default 16  
//sb.append("Hello");  
//System.out.println(sb.capacity());//now 16  
//sb.append("java is my favourite language");  
//System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
sb.ensureCapacity(20);//now no change  
System.out.println(sb.capacity());//now 34  
sb.ensureCapacity(50);//now (34*2)+2  
System.out.println(sb.capacity());//now 70 
//    String name="My. name. is. saif. ali. khan.";
//    String arr[]=name.split(". ");
//    for(String var:arr)
//            System.out.println(var);
//sample();
    }
    public static void sample()
{
   //Statements
   //if (somethingWrong) then
   IOException e = new IOException();
        try {
            throw e;
            //More Statements
        } catch (IOException ex) {
            Logger.getLogger(SumOfArray.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
}
