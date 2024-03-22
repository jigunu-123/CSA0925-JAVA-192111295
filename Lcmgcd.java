import java.util.*;
class Lcmgcd
{
public static void main(String arg[])
{
int n,n1,n2,i;
int lcm=0,gcd=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
n=sc.nextInt();
System.out.println("enter a number1:");
n1=sc.nextInt();
System.out.println("enter a number2:");
n2=sc.nextInt();
for(i=1;i<=n1||i<=n2;i++)
{
if(n1%i==0&&n2%i==0)
{
gcd=i;
}
}
lcm=(n1*n2)/gcd;
System.out.println("LCM:"+lcm);
System.out.println("GCD:"+gcd);
}
}
