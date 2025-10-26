import java.util.*;

public class Main {

    public static int longestSubarrayWithSumK(int[] a, long k, int n) {
        // We are using sliding window (two-pointer) approach to solve this problem , Time complexity = O(n)

        int l = 0, r = 0;
        long sum = 0;
        int ans = 0;

        while (r < n) {

            sum += a[r];

            while (l <= r && sum > k) {
                sum -= a[l];
                l++;
            }

            if (sum == k) {
                ans = Math.max(ans, r - l + 1);
            }

            r++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(longestSubarrayWithSumK(arr, k, n));
        
        sc.close();
    }
}
