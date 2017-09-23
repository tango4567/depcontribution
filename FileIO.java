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
import java.util.Scanner;

public class FileIO {

    static int a;
    static int b;
    static char op;
    static float result;
    static BufferedWriter bw;
    static FileWriter fw;
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            String path = "D:\\javad\\deepak3.txt";
            System.out.println("Enter the value of a and b");
             fw = new FileWriter(path);
             bw = new BufferedWriter(fw);
            int a = obj.nextInt();
            int b = obj.nextInt();
            System.out.println("Enter the Opretion ");
            op = (char) System.in.read();
            
            operation(a, b, op);
            
            bw.close();
            fw.close();
            System.out.println("Bye");
        } catch (Exception e) {
        }
        System.out.println("Succseec..");
    }

    private static void operation(float v1, float v2, char op) throws IOException {

        switch (op) {
            case '+':
                result = v1 + v2;
                writeToFile(v1, v2, result, op);

                break;
            case '-':
                result = v1 - v2;
                writeToFile(v1, v2, result, op);
                break;
            case '*':
                result = v1 * v2;
                writeToFile(v1, v2, result, op);
            case '/':
                result = v1 / v2;
                writeToFile(v1, v2, result, op);

        }
    }

    public static void writeToFile(float v1, float v2, float result, char op) throws IOException {
        System.out.println("enter");
        try {
            bw.write("\n  a = " + v1);
            bw.newLine();
            bw.write("\n  b = " + v2);
            bw.newLine();
            bw.write(" " + op + "  ");
            bw.newLine();
            bw.write("----------------\n");
            bw.newLine();
            bw.write("\t" + result);
            bw.newLine();
            bw.flush();
          
            
        } catch (IOException ex) {

        }

    }
}
///  a = 10 
///  b = 10 
//      +
///-----------
//        20

