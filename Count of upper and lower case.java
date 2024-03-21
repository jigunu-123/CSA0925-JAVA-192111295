import java.util.*;
class Encounter
{
public static void main(String arg[])
{
char ch='\0';
int ucount=0;
int lcount=0;
int ncount=0;
Scanner sc=new Scanner(System.in);
while(ch!='*')
{
System.out.println("enter a character:");
ch=sc.next().charAt(0);
}
if(ch>='a' && ch<='z')
{
ucount++;
}
else if(ch>='A' && ch<='Z')
{
lcount++;
}
else
{
ncount++;
}
System.out.println("count of uppercase:"+ucount);
System.out.println("count of lowecase:"+lcount);
System.out.println("count of number:"+ncount);
}
}



