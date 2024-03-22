import java.util.*;
class uniquech
{
public static void main(String[] args)
{
String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
str=sc.nextLine();
int n=str.length();
for(int i=0;i<n;i++)
{
int flag=0;
for(int j=0;j<n;j++)
{
 if(str.charAt(i)==str.charAt(j)&&i!=j)
{
 flag=1;
 break;
} 
}

if(flag==0)
{
System.out.println(" the result:"+str.charAt(i));
}
}
}
}
