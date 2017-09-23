class Superclass
{
int a=45,b=12,c;
void sub()
{
c=a+b;
System.out.println("Super class value of A "+a);
System.out.println("Super class value of B "+b);
System.out.println("Super class value of C"+c);
}
}
class Subclass extends Superclass
{
void sub()
{
c=a-b;
System.out.println("Sub class value of A "+a);
System.out.println("Sub class value of B "+b);
System.out.println("Sub class value of C"+c);

}
}

public class SingleInhretance
{
public static void main(String ar[])
{
Subclass obj = new Subclass();

obj.sub();
obj.sub();
}
}