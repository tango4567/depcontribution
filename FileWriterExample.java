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
import java.io.FileWriter;  
public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
             String ar="Welcome to sowmitras.";
           //FileWriter fw=new FileWriter("D:\\javad\\deepak3.txt");    
           FileWriter fw1=new FileWriter(ar);
           fw1.write("Welcome to sowmitras.");    
           fw1.append("deepak patidar is student");
           fw1.write(" bhai bhai");
           
             
           fw1.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  
