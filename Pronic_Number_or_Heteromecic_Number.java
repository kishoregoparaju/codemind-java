import java.util.Scanner;
class pronic
{
    public static void main(String args[])
    {
        int n,i,c=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                c++;
                break;
            }
        }
        if(c==1)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}