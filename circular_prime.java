import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,c=0,p=0,j,r,i,temp;
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        for(i=1;i<=temp;i++)
        {
            if(temp%i==0)
            {
                c++;
            }
        }
        for(j=1;j<=s;j++)
        {
            if(s%j==0)
            {
                p++;
            }
        }
        if(p<3 && c<3)
        {
            System.out.println("circular prime");
        }
        else if(c<3)
        {
            System.out.println("prime but not a circular prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}