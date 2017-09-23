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
public class StringBulider1 {
public static void main(String ar[]){

    // 1 append
    //StringBuilder sb=new StringBuilder("Hello ");  
//sb.append("saif");//now original string is changed  
//System.out.println(sb);//prints Hello Java 
// 2 insert
//sb.insert(1,"Java");//now original string is changed  
//System.out.println(sb);//prints HJavaello  
////3 replace
StringBuilder sb=new StringBuilder("");  
//sb.replace(1,3,"Java");  
//System.out.println(sb);//prints HJavalo
////4
//sb.delete(1,3);  
//System.out.println(sb);//prints Hlo  
////5
//sb.reverse();  
//System.out.println(sb);//prints olleH  
////6
//System.out.println(sb.capacity());//default 16  
//sb.append("Hello");  
//System.out.println(sb.capacity());//now 16  
//sb.append("java is my favourite language");  
//System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
////7
//System.out.println(sb.capacity());//default 16  
//sb.append("Hello");  
//System.out.println(sb.capacity());//now 16  
//sb.append("java is my favourite language");  
//System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
//sb.ensureCapacity(40);//now no change  
//System.out.println(sb.capacity());//now 34  
//sb.ensureCapacity(50);//now (34*2)+2  
//System.out.println(sb.capacity());//now 70

int a[] = {1,2,3,4,5};//new int[10];
int i=1;
for(int var:a)
{
    System.out.println(var);
}
}    
}
