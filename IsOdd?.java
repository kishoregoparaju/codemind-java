import java.util.Scanner;
public class odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n%2!=0)
        {
            System.out.println("2");
            
        }
        else
        {
            System.out.println("1");
        }
    }
}