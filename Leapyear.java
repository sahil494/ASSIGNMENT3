import java.util.Scanner;
class Leapyear{
public static void main(String[] args)
{
Scanner s=new Scanner (System.in);
System.out.println("Enter year");
int year=s.nextInt();
if (year%4==0)
{
System.out.println("Leap year");
}
else if (year%100==0)
{
System.out.println("Not a leap year");
}
else if (year%400==0)
{
System.out.println("Leap year");
}
else 
{
System.out.println("Not a leap year");
}
}
}