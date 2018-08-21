import java.util.Scanner;
class Prime{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
int i,c=0;
for (i=1;i<=num;i++)
{
if (num%i==0)
{
c++;
}
}
if (c==2)
{
System.out.println("Number is prime");
}
else
{
System.out.println("Number is not prime");
}
}
}