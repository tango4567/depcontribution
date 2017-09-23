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
 class Stud implements Serializable{
    int roll,age ;
    String name;
    int totalMarks;
    Stud(int x,String w){
    roll=x;
    name=w;
         }
        Stud(int x,int w){
    age=x;
    totalMarks=w;
         }
        
}
public class SerializationTest{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Stud obj = new Stud(23,"deepak");
        Stud obj1=new Stud(26,345);
        File f = new File("D:/javad/Serial.txt");
        f.createNewFile();
        FileOutputStream os = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(obj1);
        oos.writeObject(obj);
        System.out.println("success....");
        oos.close();
        os.close();
        
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Stud p= (Stud)ois.readObject();
        System.out.println(p.age+" "+p.totalMarks );
        //System.out.println(p.totalMarks+" "+p.age );
        fis.close();
        ois.close();
    }
} 