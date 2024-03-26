import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int org=num;
		int rev=0,rem;
		while(num>0)
		{
		    rem=num%10;
		    rev=rev*10+rem;
		    num=num/10;
		}
		System.out.println("Reverse of the number "+rev);
		if(org==rev)
		{
		    System.out.println("Palidrome");
		}
		else
		{
		    System.out.println("not palindrome");
		}
	}
}
