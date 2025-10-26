
public class SortedOrNot {
	public static void main(String[] args) {
		int n=5;
		int arr[]= {1,2,3,4,5};
		int element=isSorted(5,arr);
		if(element==1) System.out.println("Array is Sorted");
		else System.out.println("Array is not Sorted");
	}
	 public static int isSorted(int n, int []a)
	 {
		 for(int i=1;i<n;i++)
	     {
			 if(a[i-1]>a[i]) return 0;
	     }
	     return 1;
	  }
}
