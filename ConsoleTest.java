package deepak;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ultra
 */
import java.io.*;
public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter");
        String p=c.readLine(null, args);
        System.out.println(""+p);
       
        
    }
    
}
