
public class MoveZeroToEnd {
	public static void main(String[] args) {
		int arr[]= {1,0,0,4,5};
		moveZeroes(arr);
		System.out.println("Arrays after moving zeros to end is : ");
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
	}
	public static void moveZeroes(int[] nums)
    {
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
    }
}
