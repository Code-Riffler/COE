/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i;
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		for(i=0;i<10;i++)
		{
		    num[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
		    if(num[i]>0)
		    {
		        System.out.println("Positive numbers are "+num[i]);
		    }
		}
	}
}
