public class SetRightMostUnsetBit {

    public static void main(String[] args) {
        int n = 10;
        int result = setBits(n);
        System.out.println("Number before: " + n);
        System.out.println("Number after setting rightmost unset bit: " + result);
    }

    public static int setBits(int n) {
        if ((n & (n + 1)) == 0) return n;
        return n | (n + 1);
    }
}
