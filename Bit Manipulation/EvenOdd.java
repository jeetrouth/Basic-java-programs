public class EvenOdd {

    public static void main(String[] args) {
        int N = 7;  
        System.out.println("The number " + N + " is " + oddEven(N));
    }

    public static String oddEven(int N) {
        if ((N & 1) == 0) 
            return "even";
        else 
            return "odd";
    }
}
