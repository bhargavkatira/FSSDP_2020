import java.util.Scanner;
class IfElse
{
public static void main(String[] args)
{
int user;
Scanner age  = new Scanner(System.in);

System.out.print("Input by the user ");

 user = age.nextInt();
if (user <= 18){
System.out.print("user is younger or 18");
}
else
 {
System.out.print("user is older than 18");
}
}
}