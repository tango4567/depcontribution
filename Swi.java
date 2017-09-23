public class Swi{
int a=1;
void swt(){
switch(a)
{
case 1:
              {
                 System.out.println("your in case1");
                  break;
              }
case 2:
              {
                 System.out.println("your in case2");
                  break;
 }
case 3:
              {
                 System.out.println("your in case3");
                 break;
              }
default :
            {
             System.out.println("your in defult");  break;
             }
}
}
public static void main(String args[]){
Swi obj1=new Swi();
obj1.swt();

}
}