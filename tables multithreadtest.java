 class Athread implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("5*"+i+"="+5*i);
}
}
}
class Bthread implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("10*"+i+"="+10*i);
}
}
}
class Multithreadtest
{
public static void main(String arg[])
{
Athread c=new Athread();
Bthread d=new Bthread();
Thread t1 = new Thread(c);
Thread t2 = new Thread(d);

t1.start();
t2.start();
}
}
