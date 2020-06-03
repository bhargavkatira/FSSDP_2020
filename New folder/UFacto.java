import java.util.*;
class UFacto
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

int i=1, fac = 1, n, z= 1;
n = sc.nextInt();
System.out.println("Input from the user : " + n);
for(i=1;i<=n;i++)
{
fac = i;
z = z*fac;

}
System.out.println("Factorial of 5 is : "+z);

}
}