import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number-1");
		int a=sc.nextInt();
		
		System.out.println("Enter number-2");
		int b=sc.nextInt();
		
		int c=Math.max(a,b);
		System.out.println("The max value is "+c);
	}
}
