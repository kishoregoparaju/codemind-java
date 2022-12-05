import java.util.Scanner;
class Bill
{
    public static void main(String args[])
    {
        String id,customer;
        Double units;
        Scanner sc=new Scanner(System.in);
        id=sc.nextLine();
        customer=sc.nextLine();
        units=sc.nextDouble();
        double bill=0;
        double surcharge=100;
        if (units<200)
        {
            bill=(units*1.20);
        }
        else if (units<400)
        {
            bill=units*1.50;
        }
        else if (units<600)
        {
            bill=units*1.80;
        }
        else if (units>=600){
            bill=units*2;
        }    
        if(bill>400)
        {
            surcharge=(bill*0.15);
        }
            
        System.out.format("%.2f",bill+surcharge);
       
    }
}