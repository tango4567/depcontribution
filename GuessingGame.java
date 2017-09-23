import  java.util.Random;
import java.util.Scanner;
public class GuessingGame{
public static void main(String ar[]){
Random r=new Random();
int  guess=r.nextInt(1000);
int  t=0;
int tri;
Scanner i=new Scanner(System.in);
System.out.println("Guess a number btween 1 to 1000");
tri=i.nextInt();
if(guess==tri){
System.out.println("Your correct");
}else{
System.out.println("Your worng");
}

}
}