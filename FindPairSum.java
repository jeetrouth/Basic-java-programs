public class FindPairsSum {
    public static void findPairsHash(int[] arr, int target) {
        java.util.Map<Integer, Integer> count = new java.util.HashMap<>();
        for (int v : arr) count.put(v, count.getOrDefault(v, 0) + 1);

        for (int v : arr) {
            int c = count.get(v);
            if (c == 0) continue;
            count.put(v, c - 1);
            int comp = target - v;
            int cc = count.getOrDefault(comp, 0);
            if (cc > 0) {
                System.out.println(v + " + " + comp + " = " + target);
                count.put(comp, cc - 1);
            }
        }
    }

    public static void findPairsTwoPointer(int[] arr, int target) {
        int[] a = java.util.Arrays.copyOf(arr, arr.length);
        java.util.Arrays.sort(a);
        int i = 0, j = a.length - 1;
        while (i < j) {
            int sum = a[i] + a[j];
            if (sum == target) {
                System.out.println(a[i] + " + " + a[j] + " = " + target);
                i++; j--;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, -1, 4, 3};
        int target = 7;

        System.out.println("Hash-based pairs:");
        findPairsHash(arr, target);

        System.out.println("\nTwo-pointer pairs:");
        findPairsTwoPointer(arr, target);
    }
}