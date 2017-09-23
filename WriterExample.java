/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;

import java.io.*;  
public class WriterExample {  
    public static void main(String[] args) {  
        try {  
            try (Writer w = new FileWriter("D:\\javad\\deepak2.txt")) {
                String content = "I love my country ";
                w.write(content);
                w.append(content);
                w.append(content);
            }  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  