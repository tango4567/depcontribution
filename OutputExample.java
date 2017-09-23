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
public class OutputExample {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("D:\\javad\\deepak2.txt");  
       FileInputStream inFile=new FileInputStream("D:\\javad\\deepak2.txt");
        DataInputStream ins = new DataInputStream(inFile);
        
        int p=100;
        try (DataOutputStream data = new DataOutputStream(file)) {
            
            data.writeChar('c');
            System.out.println(" "+ins.readChar());
            data.flush();
        }  
        System.out.println("Succcess...");  
    }  
}  