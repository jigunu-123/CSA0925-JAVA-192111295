import java.util.Scanner;
 
public class DecimalToBinary
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,bin=0,rem,no;
     System.out.println("Enter The Decimal Number : ");
    no= sc.nextInt();
    while (no!= 0)
        {
       rem = no% 2;
       bin+=i*rem;
        no =no/2;
        i=i*10;        }
       System.out.println("Binary number is "+bin);
    }
}
