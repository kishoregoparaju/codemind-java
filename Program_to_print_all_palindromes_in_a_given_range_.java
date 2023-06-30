import java.util.Scanner;
public class pali
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,i,rev=0,temp=0,r;
        a = sc.nextInt();
        b = sc.nextInt();
        for(i=a;i<=b;i++)
        {
            temp = i;
            rev = 0;
            while(temp!=0)
            {
                r = temp%10;
                rev = rev*10+r;
                temp = temp/10;
            }
                if(rev==i)
                {
                    System.out.printf("%d ",i);
                }
    
            
        }
    }
}