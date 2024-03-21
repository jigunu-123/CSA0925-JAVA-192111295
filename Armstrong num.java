import java.util.*;
class Armstrong
{
public static void main(String arg[])
{
int n,i,rem;
double rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the num:");
n=sc.nextInt();
int temp=n;
while(n!=0)
{
rem=n%10;
rev=rev+Math.pow(rem,3);
n=n/10;
}
if(temp==rev)
{
System.out.println(temp+"is armstrong");
}
}
}
