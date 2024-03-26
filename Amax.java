import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i;
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		int max=num[0];
		System.out.println("Enter the 10 numbers:");
		for(i=0;i<10;i++)
		{
		    num[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
		    if(num[i]>max)
		    {
		        max=num[i];
		    }
		}
		System.out.println("The max value in array is "+max);
	}
}
