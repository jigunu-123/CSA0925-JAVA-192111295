class AThread implements Runnable
{ 
 public void run()
{
 int n1=0,n2=1,n3,num,i;
 num=5;
 System.out.println(n1);
 System.out.println(n2);
 for(i=2;i<=num;i++)
{
 n3=n1+n2;
 System.out.println(n3);
 n1=n2;
n2=n3;
}
}
}
class Fibo1
{
public static void main(String[] args)
{
 AThread a = new AThread();
       

 Thread t1 = new Thread(a);
t1.start();
       
}
}
