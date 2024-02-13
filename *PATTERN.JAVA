import java.util.*;
public class Pattern
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=input.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
             for(j=n-i;j>=0;j--)
             {
                System.out.print(" ");
              }
              for(j=1;j<=i;j++)
             {
                 System.out.print(""+*+"");
             }
             System.out.println();
        }
    }
}
