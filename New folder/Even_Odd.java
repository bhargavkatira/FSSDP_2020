import java.util.*;
class Even_Odd
{
public static void main(String [] args)
{

int n;
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
if(n%2 ==0)
System.out.println("It is an even number");

else
System.out.println("It is an odd number");
}
}