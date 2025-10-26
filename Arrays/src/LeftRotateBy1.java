
public class LeftRotateBy1 {
	public static void main(String[] args) {
		int arr[]= {1,4,9,4,5};
		int arr1[]=rotateArray(arr,arr.length);
		System.out.println("Arrays after left rotating array by 1 is : ");
		for(int i=0;i<arr1.length;i++) System.out.print(arr1[i]+" ");

	}
	static int[] rotateArray(int[] arr, int n) {
        int start=arr[0];
        for(int i=1;i<n;i++) arr[i-1]=arr[i];
        arr[n-1]=start;
        return arr;
	}
}
