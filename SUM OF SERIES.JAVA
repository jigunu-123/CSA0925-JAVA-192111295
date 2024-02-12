import java.util.Scanner;
public class import java.util.Scanner;
public class SumOfn 
{  
public static void main(String[] args)   
{  
int i, num , sum = 0; 
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit:");
num=sc.nextInt();   
for(i = 1; i <= num; ++i)  
{   
sum = sum + i;  
}    
System.out.println("Sum of First n Natural Numbers is = " + sum);  
}  
}  
