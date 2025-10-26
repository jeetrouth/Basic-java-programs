
public class LargestElement {
	public static void main(String[] args) {
		int n=5;
		int arr[]= {1,2,8,4,5};
		int element=largestElement(arr,5);
		System.out.println("Largest Element in Array is : "+element);
	}
	static int largestElement(int[] arr, int n)
    {
       int max=arr[0];
       for(int i=1;i<n;i++)
       {
           if(arr[i]>max) max=arr[i];
       }
       return max;
   }
}
