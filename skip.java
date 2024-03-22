import java.util.*;
class Skip
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,m,n,k;
System.out.println("enter the m value");
m=sc.nextInt();
System.out.println("enter the n value");
n=sc.nextInt();
System.out.println("enter the k value");
k=sc.nextInt();
for(i=m;i<=n;i=i+k+0)
{
System.out.println(i+" ");
}
}
}
