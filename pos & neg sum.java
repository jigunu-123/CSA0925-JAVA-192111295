import java.util.*;
class POSITIVENEGATIVE
{
 public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter -1 to stop");
 int num=0;
 int sum=0,sum1=0,pos=0,neg=0;
 while(num!=-1)
{
 num=sc.nextInt();
 if(num>0)
{ 
 pos++;
 sum=sum+num;
}
else if(num<-1)
{
neg++;
sum1=sum1+num;
}
}
double avgpos=(sum)/pos;
double  avgneg=(sum1)/neg;
System.out.println("average  negative: "+avgneg);
System.out.println("average positive : "+avgpos);
}
}
