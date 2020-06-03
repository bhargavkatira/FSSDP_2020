class Fibo
{
public static void main(String[] args)

{
int i =1, t1=0,t2= 1, sum =0;
int  n=10;
System.out.println("First "+n + "number");


for( i= 0; i<=n; i++)
{
System.out.print(t1+  "+");
sum = t1+t2;
t1= t2;
t2 = sum;
}


}

}