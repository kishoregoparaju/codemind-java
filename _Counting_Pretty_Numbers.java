import java.util.Scanner;
public class jfkl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t,a,b,i,j,c=0,r;
        t = sc.nextInt();
        for(i=0;i<t;i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c=0;
            for(j = a; j<=b;j++)
            {
                r = j%10;
                {
                    if(r == 2 || r==3 || r==9)
                    {
                        c++;
                    }
                    
                }
            }
            System.out.println(c);
        }
    }
}