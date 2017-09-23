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
import java.io.*;  

public class BufferedReaderExample {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\javad\\deepak2.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i = 0;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
}    
