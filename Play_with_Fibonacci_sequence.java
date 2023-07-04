import java.util.Scanner;
public class jfkl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,n,i;
        n = sc.nextInt();
        a = 0;
        b = 1;
      
        for(i=1;i<=n;i++)
        {
           c = a+b;
        System.out.print(a+" ");
        a = b;
        b = c;
        }
        
        
       
    }
}