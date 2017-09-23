/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepak;




import java.io.IOException;
import java.util.Scanner;


/**
 *Y
 * @author sowt
 */

public class KBC {
 static String str[];
    static char ans =89,dis;
   static boolean i=false;
  public static int Choise;
   static Scanner input = new Scanner(System.in);
  
    public static void main(String[] args) throws IOException {
        str = new String[10];
        
        System.out.println("Welcome To Kon Bane ga Crore Pati ");
        System.out.println("TO Start your KBC \n"
           + "Pleare Enter Y/N");       
        dis = (char) System.in.read();
     
        if(ans==dis)
        {
            
                         
            if(first_Q1(i)==true)
            {
                if(first_Q2(i)==true)
                {
                    System.out.println("Your First leval in Complete \n");
                    if(first_Q3(i)==true)
                    {
                        if(first_Q4(i)==true)
                    {
                        System.out.println("Your second leval in Complete \n");
                        if(first_Q5(i)==true)
                    {
                        System.out.println("Bhadai of ap ne 1,6000000 jit liye \n"
                                + "Thanks For Play in  KBC \n");
                    }else
                    {
                    System.out.println(" sorry your not going to Next quetion you Win in 80 lakh \n");
                    }
                    
                    }else
                    {
                    System.out.println(" sorry your not going to Next quetion you Win in 80 lakh \n");
                    }                    
                    }else
                    {
                    System.out.println(" sorry your not going to Next quetion you Win in 20 lakh \n");
                    }
                }else
                {
                 System.out.println(" sorry your not going to Next quetion \n");
                }
            }
            else
            {
                System.out.println(" sorry your not going to Next quetion \n");
            }
        
        }
      
        System.out.println("thanks To play KBC \n");
    }
     
    private static boolean first_Q1(boolean i) {
       System.out.println("Q.1:- What is a java..");
            System.out.println("1. Tamil Language \t\t 2. Object Oriented Programing Language \n"
                    + "3. English Language \t\t 4. Game Application");
            
          int choise = input.nextInt();
           
          
            switch(choise)
            {
                case 1:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "Ap Ban Gaye Road Pati\n");
                   
                  return false;
                    
                }
                case 2:
                {
                    System.out.println("Ap Ko Milte he 10 Lakh Rs. "
                            + "your Rigth Ans \n");
                   return true;
                    
                }
                case 3:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "Ap Ban Gaye Road Pati\n");
                   return false;
                }
                case 4:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "Ap Ban Gaye Road Pati\n");
                    return false;
                }
                default:
                {
                    System.out.println("Gate out In KBC");
                }
            }
       return false;
    }
    private static boolean first_Q2(boolean i) {
       System.out.println("Q.2 :- What is a 125.36 ");
            System.out.println("1. Fload Value \t\t 2. Integer Literal \n"
                    + "3. Fload Literal \t\t 4. Double value");
            System.out.print("Your Ans is :- ");
          int choise = input.nextInt();
          
          
            switch(choise)
            {
                case 1:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "Ap Ban Gaye Road Pati\n");
                   
                  return false;
                    
                }
                case 2:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "Ap Ban Gaye Road Pati\n");
                    
                   return false;
                    
                }
                case 3:
                {
                    System.out.println("Ap Ko Milte he 20 Lakh Rs. "
                            + "your Rigth Ans \n");
                   return true;
                }
                case 4:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "Ap Ban Gaye Road Pati\n");
                    return false;
                }
                default:
                {
                    System.out.println("Gate out In KBC Your Follow in Rule\n");
                }
            }
       return false;
    }
    private static boolean first_Q3(boolean i) {
       System.out.println("Q.3 :- test1 obj = new test1() \n"
               + "What is a  test1().. ");
            System.out.println("1. class name  \t\t 2. Memory allowcation \n"
                    + "3. refrence \t\t  4. constructer");
            System.out.print("Your Ans is :- ");
          int choise = input.nextInt();         
            switch(choise)
            {
                case 1:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "you Win in 20 lakh\n");
                   
                  return false;
                    
                }
                case 2:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "you Win in 20 lakh\n");
                   return false;
                    
                }
                case 3:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "you Win in 20 lakh\n");
                   return false;
                }
                case 4:
                {
                    System.out.println("Ap Ko Milte he 40 Lakh Rs. \n"
                            + "your Rigth Ans\n");
                    return true;
                }
                default:
                {
                    System.out.println("Gate out In KBC Your Follow in Rule\n");
                }
            }
       return false;
    }
    private static boolean first_Q4(boolean i) {
       System.out.println("Q.4 :- What is a java Frist name ..");
            System.out.println("1. oak \t\t 2. Object Oriented Programing Language \n"
                    + "3. java \t\t 4. Green project");
            System.out.print("Your Ans is :- ");
          int choise = input.nextInt();         
            switch(choise)
            {
                case 1:
                {
                     System.out.println("Ap Ko Milte he 80 Lakh Rs. "
                            + "your Rigth Ans \n");
                   
                  return true;
                    
                }
                case 2:
                {
                   System.out.println("Sorry your wrong Ans \n"
                            + "you Win in 20 lakh\n");
                   return false;
                    
                }
                case 3:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "you Win in 20 lakh\n");
                   return false;
                }
                case 4:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "you Win in 20 lakh\n");
                    return false;
                }
                default:
                {
                    System.out.println("Gate out In KBC Your Follow in Rule\n");
                }
            }
       return false;
    }
    private static boolean first_Q5(boolean i) {
       System.out.println("Q.5 :- What is a Gating the char value "
               + "Scanner input = new Scanner(System.in);\n"
               + "What is next line ");
            System.out.println("1. input.next(); \t\t 2. input.nextChar(); \n"
                    + "3. System.in.read(); \t\t 4. input.nextInt(); ");
            System.out.print("Your Ans is :- ");
          int choise = input.nextInt();
          
          
            switch(choise)
            {
                case 1:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "you Win in 80 lakh\n");
                   
                  return false;
                    
                }
                case 2:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "you Win in 80 lakh\n");
                   return false;
            
                }
                case 3:
                {
                   System.out.println("Ap Ko Milte he 1,6000000  Rs. "
                            + "your Rigth Ans \n");
                   return true;
                }
                case 4:
                {
                    System.out.println("Sorry your wrong Ans \n"
                            + "you Win in 80 lakh\n");
                    return false;
                }
                default:
                {
                    System.out.println("Gate out In KBC Your Follow in Rule");
                }
            }
       return false;
    }  
}