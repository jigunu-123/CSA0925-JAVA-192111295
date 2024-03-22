import java.util.*;
class RecursiveNumber
{
public static int factorial(int n)
{
if(n==0||n==1)
 return 1;
else
return n*factorial(n-1);
}
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
int result=factorial(n);
System.out.println("the factorial number is: " +result);
}
}
