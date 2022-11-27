import java.util.*;
class plaindrome
{
    public static void main(String args[])
    {
        int n,r,rev=0,temp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp=n;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.print("2");
        }
        else
        {
            System.out.print("1");
        }
    }
}