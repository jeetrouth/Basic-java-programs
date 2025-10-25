/**
 	Code to Print the following Pattern :
 	12345
 	1234
 	123
 	12
 	1
*/
import java.util.Scanner;
public class P6 {
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
		for(int j=1;j<=not-i+1;j++) System.out.print(j+" ");
		System.out.println();
		}
	}

}
