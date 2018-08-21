import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number");
int num=s.nextInt();
int reverse=0;
int orig=0;
int remainder;
orig=num;
while (num>0)
{
remainder=num%10;
reverse=reverse*10+remainder;
num=num/10;
}
if (reverse==orig)
{
System.out.println("Number is palindrome number");
}
else 
{
System.out.println("Not a palindrome number");
}
}
}