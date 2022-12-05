import java.util.Scanner;
class can
{
    public static void main(String args[])
    {
       int n,i,c=0,a;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for(i=1;i<=n;i++)
       {
           a=sc.nextInt();
           if(a%2==1)
           {
               c=c+1;
           }
       }
       if(c<=2)
       {
           System.out.println("YES");
       }
       else
       {
           System.out.println("NO");
       }
    }
}