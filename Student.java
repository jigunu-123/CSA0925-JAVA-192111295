import java.util.*;
class Student
{
int Regno,m1,m2,m3,m4,m5,avg,total;
String name;
Student()
{
 name="jigunu";
Regno=123456;
m1=95;
m2=98;
m3=89;
m4=90;
m5=93;
}
 void calculation()
{
total=m1+m2+m3+m4+m5;
avg=(m1+m2+m3+m4+m5)/5;
}
void display()
{
System.out.println("name is="+name);
System.out.println("Reg number="+Regno);
System.out.println("1 st subject="+m1);
System.out.println("2 st subject="+m2);
System.out.println("3 st subject="+m3);
System.out.println("4 st subject="+m4);
System.out.println("5 st subject="+m5);
System.out.println("Total Marks="+total);
System.out.println("Average Marks="+avg);
}
public static void main(String args[])
{
Student S=new Student();
S.calculation();
S.display();
}
}
