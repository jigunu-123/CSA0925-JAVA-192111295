import java.util.*;
class Vote
{
public static void main(String arg[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the n:");
n=sc.nextInt();
int a=18-n;
if(n>=18)
{
System.out.println(n+ "is a eligible to vote");
}
else
{
System.out.println("you are allowed to vote after " +a + "years");
}
}
}
