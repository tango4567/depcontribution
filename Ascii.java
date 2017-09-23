import java.util.Scanner;
public class Ascii{
static String a;
static Scanner input;	
public static void main(String ar[]){
	System.out.print("Please enter any letter = ");
	inputUser();
	checkCondition();
	}
public static void checkCondition(){
	if(a.length()!=1){
		System.out.println("Please Enter Only Single Letter");
	inputUser();
	checkCondition();	
	
	}else{
                                     //char temp=a.charAt(0);
                                    	System.out.println("ASCII value of "+a.length()+" is "+(int) a.charAt(0));
	}

}

public static void inputUser(){
//input = new Scanner(System.in);
	a = ' ';//input.next();	
}
}