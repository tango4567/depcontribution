
public class hexa
{
public static void main(String ar[])
{
int a=9;
int b[]= new int [15];
int i=0;
while(a!=0)
 {
  b[i]=a%2;
   a=a/2;
i++;
 }
for(int j=i-1;j>=0;j--)
{
System.out.print(b[j]);
}
}
}