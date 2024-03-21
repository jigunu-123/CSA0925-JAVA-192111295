import java.util.*;
class Countpc
{
public static void main(String arg[])
{
int n,i,j;
int pcount=0;
int ccount=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the num:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the array:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
int count=0;
for(j=1;i<=a[i];j++)
{
if(a[i]%j==0)
{
count=count+1;
}
}
if(count==2)
{
pcount++;
}
else
{
ccount++;
}
}
System.out.println("count of prime:"+pcount);
System.out.println("count of composite:"+ccount);
}
}

