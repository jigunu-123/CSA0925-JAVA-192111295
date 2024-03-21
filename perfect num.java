import java.util.*;
class Perfectnum
{
public static void main(String arg[])
{
int n,count=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the num:");
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
count=count+i;
}
}
if(n==count)
{
System.out.println(n+ " is a perfect number");
}
}
}
