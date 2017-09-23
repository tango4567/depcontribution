import java.util.Scanner;
public class Pattern2{
	public static void main(String ar[]){
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the any value ");     
		int n = input.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=n;k>i;k--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print( i);
			}
			System.out.print(" \n");
		}
	}
}
