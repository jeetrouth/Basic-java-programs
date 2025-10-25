/**
 	Code to Print the following Pattern :
 	*****
 	****
 	***
 	**
 	*
*/
import java.util.Scanner;
public class P5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms = ");
		int not=sc.nextInt();
	    printPattern(not);
	}
	static void printPattern(int not)
	{
		for(int i=1;i<=not;i++)
		{
		for(int j=not;j>=i;j--) System.out.print("* ");
		System.out.println();
		}
	}
}
