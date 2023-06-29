import java.util.*;
public class small
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t,n,i,k,fac = 1,j;
        t = sc.nextInt();
        for(i = 1;i<=t;i++)
        {
            n = sc.nextInt();
            fac = 1;
            
            for(j=1;j<=n;j++)
            {
                fac=fac*j;
                
            }
             System.out.println(fac);
            

          
        }
         
    }
}