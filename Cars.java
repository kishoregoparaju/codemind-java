import java.util.*;
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = sc.nextInt();
		if(a>b){
		    System.out.format("-1");
		}
		else{
		    int c=1,s1=a,s2=b;
		    while(d+s1>=s2){
		        c++;
		        s1 = s1+a;
		        s2 = s2+b;
		    }
		    System.out.println(c);
		}
	}
}