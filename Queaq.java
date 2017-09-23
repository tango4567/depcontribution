import java.util.Scanner;
public class Queaq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of queaq");
        int size = input.nextInt();        
        int queaq[] = new int[size];
        int rear=0,top=0;
        System.out.println("Welcome to queaq program ");
        int choise=0;
        do{
            System.out.println("1.push..");
            System.out.println("2.pop..");
            System.out.println("3.display..");
            System.out.println("4.exit..");
            System.out.println("please enter the choise..");
            choise =input.nextInt();
            
            switch(choise){
                case 1:
                {
                    if(top==top-1)
                    {
                        System.out.println("queaq is overflow");
                    } else {
                        int num=0;
                        queaq[top]=num;
                        top++;
                    }
                    break;
                }
                case 2:
                {
                
                    break;
                }
                case 3:
                {
                    for(int i=0;i<top;i++)
                    {
                        System.out.println(queaq[i]);
                    }
                    break;
                }
                case 4:
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("your wrong choise please again choise ");
                }
                
            }
        }while(choise>0);
        
        
    }
}