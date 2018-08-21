import java.util.Scanner;
class Reverse{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
int remainder=0;
int reverse=0;
while (num!=0)
{
remainder=num%10;
reverse=reverse*10+remainder;
num=num/10;
}
System.out.println("Reverse of the number is:-" +reverse);
}
}