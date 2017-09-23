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

public class FileToWrite {

    static FilterOutputStream dos;
    static FileWriter fw;
    static FileReader fr;
    static BufferedReader br;
    static BufferedWriter bw;
    static PrintWriter pw;
    static int v1, v2, result;
    static char op;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        try {
            String ar = "C:\\Users\\ultra\\Desktop\\myproject\\newprogram.txt";
            fw = new FileWriter(ar);
            fr = new FileReader(ar);
            bw = new BufferedWriter(fw);
            br = new BufferedReader(fr);
             String ans;
            do {
                
                System.out.println("You Wont To Continue Y/N");
                ans = input.next();
                if("Y".equals(ans)){
                System.out.println("Enter the a and b value ");
                v1 = input.nextInt();
                v2 = input.nextInt();
                System.out.println("Enter the Opretion and Your Show in Histry To Enter H");
                op = (char) System.in.read();
                opretionPerform(v1, v2, op);
                }else{
                bw.flush();
            bw.close();
            fw.close();
                    System.exit(0);}
                

            } while (!"N".equals(ans));
            
        } catch (FileNotFoundException e) {
        }

    }

    private static void opretionPerform(int v1, int v2, char op) throws IOException {
        switch (op) {
            case '+':
                result = v1 + v2;
                writeInFile(v1, v2, op, result);
                break;
            case '-':
                result = v1 - v2;
                writeInFile(v1, v2, op, result);
                break;

            case '*':
                result = v1 * v2;
                writeInFile(v1, v2, op, result);
                break;
            case '/':
                result = v1 / v2;
                writeInFile(v1, v2, op, result);
                break;
            case 'H':
                ReadToFile();
                break;
            default:
                System.out.println("Is not Perform opreation");
        }
    }

    private static void writeInFile(int v1, int v2, char op, int result) throws IOException {
        bw.newLine();
        bw.append("a = " + v1 + "\n");
        bw.newLine();
        bw.append("b = " + v2 + "\n");
        bw.newLine();
        bw.append("    " + op + "\n");
        bw.newLine();
        bw.append("-----------------------");
        bw.newLine();
        bw.append("result = " + result);
        bw.flush();

    }

    private static void ReadToFile() throws IOException {
    int i;
                 while((i=br.read())!=-1)
                {
                    System.out.print((char)i);
                    br.readLine();
                }
    }
}