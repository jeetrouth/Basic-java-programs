/**
 	Code to Print the following Pattern :
 	1
 	12
 	123
 	1234
 	12345
*/
import java.util.Scanner;
public class P3 {
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
		for(int j=1;j<=i;j++) System.out.print(j+" ");
		System.out.println();
		}
	}

}