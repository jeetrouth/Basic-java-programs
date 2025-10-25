/**
 	Code to Print the following Pattern :
 	*****
 	*****
 	*****
 	*****
 	*****
*/
import java.util.*;
public class P1 {
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
		for(int j=1;j<=not;j++) System.out.print("* ");
		System.out.println();
		}
	}
}
