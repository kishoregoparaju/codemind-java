import java.util.Scanner;
public class odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],i,r,rev=0,c=0,temp;
        n = sc.nextInt();
        a = new int[n];
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            rev = 0;
            temp = a[i];
            while(temp!=0)
            {
            r = temp%10;
            rev = rev*10+r;
            temp = temp/10;
            }
            if(rev==a[i])
            {
                c++;
            }
        }
       System.out.print(c); 
       
    }
}