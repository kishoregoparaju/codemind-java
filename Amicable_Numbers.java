import java.util.Scanner;
class amicable
{
    public static void main(String args[])
    {
        int a,b,i,j,sum=0,sum1=0;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for (i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        for (j=1;j<b;j++)
        {
            if(b%j==0)
            {
                sum1=sum1+j;
            }
        }
        if(sum1==a)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}