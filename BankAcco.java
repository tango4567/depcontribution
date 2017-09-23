/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepak;

import static deepak.BankAccountSubClass.*;
import java.io.IOException;
import java.util.Scanner;

public class BankAcco  {

    static int a = 10;
    static int i = 0;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("\t" + welcome);
        BankAccountSubClass obj[] = new BankAccountSubClass[10];
       
        do {
            System.out.println(create_of_newAccount);
            System.out.println(diposit);
            System.out.println(withdraw);
            System.out.println(checkAccount);
            System.out.println(Exit);
            System.out.print(Work + "\t");
            int Work = input.nextInt();
            switch (Work) {
                case 1: {
                    for (i = i; i <= i;) {
                        obj[i]=new BankAccountSubClass();
                        obj[i].newAccount(i);
                        i++;
                        break;
                    }
                    break;
                }
                case 2: {
                    diposit();
                }
                case 3: {
                    withdrol();
                    break;
                }

                case 4: {
                    checkNumber();
                    break;
                }
                case 5:
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println(Wrong);
                }
            }
        } while (a > 0);
    }
}