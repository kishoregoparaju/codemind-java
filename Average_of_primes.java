import java.util.Scanner;
public class Average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],i,c=0,temp,j,c1=0;
        float sum=0;
        n = sc.nextInt();
        a = new int[n];
        for(i = 0;i < n;i++)
        {
            a[i] = sc.nextInt();
        }
         for(i=0;i<n;i++)
        {
            temp = a[i];
            c=0;
            if(temp ==1)
            {
                c=1;
            }
            for(j=2;j<a[i];j++)
            {
                if(temp%j==0)
                {
                    c=1;
                }
               
            }
             if(c==0)
                {
                    c1++;
                     sum = (sum+a[i]);
                }
              
        }
          System.out.printf("%.2f",sum/c1);
    }
    
}