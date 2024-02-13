import java.util.*;
class Arraytest
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
int a[] = new int[10];
int i;
System.out.println("enter the array values:");
for (i=0; i<10; i++)
{
a[i] = s.nextInt();
}
System.out.println(" the given array values:");
for (i=0; i<10; i++)
{
System.out.println(a[i]);
}
}
}
