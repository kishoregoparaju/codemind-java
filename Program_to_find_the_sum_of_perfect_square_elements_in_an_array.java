import java.util.*;
public class sai
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int n,sum = 0,i,j;
        n=sc.nextInt();
        int a[];
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         for(i=0;i<n;i++)
        {
           for(j=1;j<=a[i];j++)
           {
               if(a[i]==j*j)
               {
                   sum = sum+a[i];
               }
           }
        }
        System.out.print(sum);
    }
}