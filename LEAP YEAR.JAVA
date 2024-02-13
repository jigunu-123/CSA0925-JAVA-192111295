import java.util.*;
class Leap
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter date(MM/DD/YYYY):");
String inputDate=sc.nextLine();
int year=Integer.parseInt(inputDate.substring(inputDate.lastIndexOf("/")+1));
if((year%4==0 && year%100!=0)||(year % 400==0))
{
System.out.println("it is a leap year");
}
else
{
System.out.println("it is not a leap year");
}
}
}
