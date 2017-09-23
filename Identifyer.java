
import java.util.Scanner;
public class Identifyer
{
    public static void main(String ar[])
	{
		int count=0;
                                    char  totalChar[];                                   
                                   Scanner input = new Scanner(System.in);
		System.out.println("Identify Special charater,Letter & Digit with count ");
		System.out.println("Enter the you String ");
		String str = input.next();
		System.out.println("Your String length "+str.length());
                
               // String strarray[] = new String[str.length()];
                char ad[]  = new char[str.length()];
                  
                for(int i = 0;i<=str.length()-1;i++)
                {
                     ad[i] = str.charAt(i);
                   
                }
            for(char j = 'A';j<='Z';j++)
                {
                 for(int i=0;i<=str.length()-1;i++)   
                 {if(ad[i]==j)
                                     {
                                        count++;
                                     }
                  } 
                          }
              
          totalChar=new char[count]; 
              for(char j = 'A';j<='Z';j++)
                {
                 for(int i=0;i<=str.length()-1;i++)   
                 {if(ad[i]==j)
                                     {
                                        for(int k=0;k<=count-1;k++){ totalChar[k]=ad[i]; }
                                     }
                  } 
                          }    
                // do{
                    System.out.println("1.Letters");
                    System.out.println("2.Speacial Symbol");
                    System.out.println("3.Digites");
                    System.out.println("4.exit");
                    System.out.println("please Select your choise ");
                 //   System.out.println("you want to continue Y/N");
                    // System.out.println("you want to continue Y/N");
                     
                    //  String ch="Y";
                    // ch = input.next();
                    int choise = input.nextInt();
                   
                    
                    switch(choise)
                    {
                        case 1:
                        {
                          
                          
                        System.out.println("all letter is= "+count);
                        for(int i=0;i<=count-1;i++){
                                  System.out.print(totalChar[i]);
                           }
                            break;
                        }
                        case 2:
                        {
                            System.out.println("all special symbol");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("all Digites is");
                            break;
                        }
                        case 4:
                        {
                            System.exit(0);
                        }
                        System.out.println("your worng choise ");
                                
                    }
                   
                //}//while(ch !='N');
                    
	}
}