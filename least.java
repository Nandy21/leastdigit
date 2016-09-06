import java.util.Arrays;
import java.util.Scanner;


public class no {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int del=sc.nextInt();
		String a[]=input.split("");
		Arrays.sort(a);
		int val=input.length()-(del-1);
		for(int i=0;i<val;i++)
		{
			System.out.print(a[i]);
		}
		
	}

}
