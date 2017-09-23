/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;
import java.io.*;
/**
 *
 * @author ultra
 */
public class filterTest {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f=new File("D:/javad/deepak3.txt");
        FileInputStream fis=new FileInputStream(f);
        FilterInputStream  filterInputStream=new BufferedInputStream(fis);
           int k =0;  
        while((k=filterInputStream.read())!=-1){  
            System.out.print((char)k);  
        }  
    fis.close();
    filterInputStream.close();
    
    }
}
