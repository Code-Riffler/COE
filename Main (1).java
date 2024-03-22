import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter n number");
	    int n=sc.nextInt();
	    
	    for(n=0;n<=10;n++)
	    {
	        System.out.println("2*"+n+"="+2*n);
	    }
	}
}
