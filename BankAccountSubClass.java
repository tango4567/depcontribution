
package deepak;

import java.io.IOException;
import java.util.Scanner;

public class BankAccountSubClass {
    
    public static final String User_info = "\t\t\t\t\t\t*****USER_INFORMATION*****";
    public static final String Account_info = "\t\t\t\t*****Account_INFORMATION*****";
    public static final String welcome = "\"Welcome TO State Bank Of India \"";
    public static final String create_of_newAccount = "\t01. Open New Account";
    public static final String diposit = "\t02. Dipocit";
    public static final String withdraw = "\t03. Withdrol";
    public static final String checkAccount = "\t04. Check User Account ";
    public static final String Exit = "\t05. Edite In User Account ";
    public static final String Work = "\tEnter Your Work :- \t";
    public static final String newUser = "\tYour New User In SBI Please Anser Y/N :-   ";
    public static final String diposit_balence = "\tEnter Your Diposit Balance :- \t";
    public static final String withdraw_balence = "\tEnter Your withdrol Balance :-\t";
    public static final String low_balence = "\tYour Account 1000 less Balance ";
    public static final String Wrong= "\tYour Wrong key Enter ";
    public static final String Account_no = "\tYour Account Number is :- ";
    public static final String checkAccount_no = "\tEnter your Account Number :-\t";
    public static final String totalBalance = "\tYour Account Total Balance is :-\t";
    public static String Village[] = new String[10];
    public static String BirthDate[] = new String[10];
    public static String Gender[] = new String[10];
    public static String Name[] = new String[10];
    public static String Tehsil[] = new String[10];
    public static String Distric[] = new String[10];
    public static String Email[] = new String[10];
    public static long balance[] = new long[10];
    public static final char ans = 'Y';
    public static final int a = 0;
    public static String Nick[] = new String[10];
    public static String Last[] = new String[10];
    public static String Father[] = new String[10];

    public static String State[] = new String[10];
    //gAccount_no = Getting Account number verialbal
    public static long Moblie_No[] = new long[10];
    public static long Addar_No[] = new long[10];
    public static long Pin_code[] = new long[10];
    public static String gAccount_no;
    public static final String AccountNumber[] = {"81092409500", "81092409501", "81092409502", "81092409503", "81092409504", "81092409505", "81092409506", "81092409507", "81092409508", "81092409509"};
    public static final String Invalid = "\tIn Correct Account Number Please ";
    static Scanner input = new Scanner(System.in);
    public static int i = 0;

    public static void newAccount(int i) throws IOException {

        do {
            System.out.print(newUser);
            char check = (char) System.in.read();
            if (ans == check) {
                System.out.println(User_info);
                System.out.print("\tFirst Name :-\t\t\tMr.");
                Name[i] = input.next();
                System.out.print("\tSecond (Nick) Name :-\t\t");
                Nick[i] = input.next();
                System.out.print("\tLast Name :-\t\t\t");
                Last[i] = input.next();
                System.out.print("\tFather Name :-\t\t\tMr.");
                Father[i] = input.next();
                System.out.print("\tDate of Birth :- \t\t");
                BirthDate[i] = input.next();
                System.out.print("\tGender :- \t\t\t");
                Gender[i] = input.next();
                System.out.print("\tYour Addar Card Number :-\t");
                Addar_No[i] = input.nextLong();
                System.out.print("\tYour Mobile Number :-\t\t+91");
                Moblie_No[i] = input.nextLong();
                System.out.print("\tVillage :-\t\t\t");
                Village[i] = input.next();
                System.out.print("\tTehsil :- \t\t\t");
                Tehsil[i] = input.next();
                System.out.print("\tDistric :- \t\t\t");
                Distric[i] = input.next();
                System.out.print("\tState :-\t\t\t");
                State[i] = input.next();
                System.out.print("\tPin_code:-\t\t\t");
                Pin_code[i] = input.nextLong();
                System.out.print("\tEmail_id :-\t\t\t");
                Email[i] = input.next();
                System.out.println("*********************************************************************");
                for (i = i; i <= i; i++) {
                    System.out.println(Account_no + " \t" + AccountNumber[i]);
                    System.out.println("\n");
                    break;

                }
                break;
            }

        } while (a > 0);
    }

    public static void display(int k) {

        System.out.println(Account_info + "\n");
        System.out.print("\tFirst Name :-\t\t\t" + Name[k] + "\t\t");
        System.out.print("\tSecond (Nick) Name :-  \t\t" + Nick[k] + "\n");
        System.out.print("\tLast Name :-\t\t\t" + Last[k] + "\t\t");
        System.out.print("\tFather Name :-\t\t\t" + Father[k] + "\n");
        System.out.print("\tDate of Birth :-\t\t" + BirthDate[k] + "\t\t");
        System.out.print("\tGender :- \t\t\t" + Gender[k] + "\t\t\n");
        System.out.print("\tYour Addar Card Number :-    \t" + Addar_No[k] + "\t\t\t");
        System.out.print("Your Mobile Number :-\t\t" + Moblie_No[k] + "\n");
        System.out.print("\tVillage :-\t\t\t" + Village[k] + "   \t\t");
        System.out.print("\tTehsil :- \t\t\t" + Tehsil[k] + "\t\t\n");
        System.out.print("\tDistric :- \t\t\t" + Distric[k] + "\t\t");
        System.out.print("\tState :-\t\t\t" + State[k] + "\t\n");
        System.out.print("\tPin_code:-\t\t\t" + Pin_code[k] + "\t\t");
        System.out.println("\tEmail_id :-\t\t\t" + Email[k] + "\n\n");

//        xtem.out.println(totalBalance + " " + balance[k]);
    }

    public static void checkNumber() {
        int s = 0;
        System.out.print(checkAccount_no);
        gAccount_no = input.next();
        for (int b = 0; b < 10; b++) {
            if (gAccount_no.equals(AccountNumber[b])) {
                display(b);
                System.out.println(Account_info);
                System.out.println(totalBalance + " " + balance[b] + "\n");
            } else {
                s++;
                if (s == 10) {
                    System.out.println(Invalid);
                }
            }
        }

    }

    public static void diposit() {
        int s = 0;
        System.out.print(checkAccount_no);
        gAccount_no = input.next();
        for (int b = 0; b < 10; b++) {
            if (gAccount_no.equals(AccountNumber[b])) {
                System.out.println(totalBalance + " " + balance[b]);
                System.out.print(diposit_balence);
                int temp = input.nextInt();
                balance[b] = balance[b] + temp;
                System.out.println(totalBalance + " " + balance[b] + "\n\n");
            } else {
                s++;
                if (s == 10) {
                    System.out.println(Invalid);

                }
            }
        }
    }

    public static void withdrol() {
        int s = 0;
        System.out.print(checkAccount_no);
        gAccount_no = input.next();
        for (int b = 0; b < 10; b++) {
            if (gAccount_no.equals(AccountNumber[b])) {
                System.out.println(totalBalance + " " + balance[b]);
                System.out.print(withdraw_balence);
                int temp = input.nextInt();
                if (balance[b] >= 1000) {
                    balance[b] = balance[b] - temp;
                    System.out.println(totalBalance + " " + balance[b] + "\n\n");
                } else {
                    System.out.println(low_balence + "\t" + balance[b]);
                }
            } else {
                s++;
                if (s == 10) {
                    System.out.println(Invalid);

                }
            }
        }
    }

}
