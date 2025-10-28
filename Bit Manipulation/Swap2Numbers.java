
public class Swap2Numbers {

    public static void main(String[] args) {
        int[] a = {5};
        int[] b = {10};

        System.out.println("Before swapping: a = " + a[0] + ", b = " + b[0]);
        swapNumber(a, b);
        System.out.println("After swapping: a = " + a[0] + ", b = " + b[0]);
    }

    public static void swapNumber(int a[], int b[]) {
        a[0] = a[0] ^ b[0];
        b[0] = a[0] ^ b[0];
        a[0] = a[0] ^ b[0];
    }
}
