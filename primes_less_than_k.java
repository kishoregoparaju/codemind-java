import java.util.Scanner;
public class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],i,j,c=0,temp,k,c1=0;
        n = sc.nextInt();
        a = new int[n];
        for (i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        k = sc.nextInt();
        for(i = 0;i<n;i++)
        {
            temp = a[i];
            c = 0;
            if(temp==1)
            {
                c=1;
            }
            for(j=2;j<temp;j++)
            {
                if(temp%j==0)
                {
                    c=1;
                    break;
                }
           
            }
             if(c==0 && k>=temp)
            {
                c1++;
              
               
            }
             
        }
          System.out.println(c1);
    }
}