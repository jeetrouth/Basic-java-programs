public class ClearIBit {

    public static void main(String[] args) {
        int n = 13;   
        int k = 3;    
        
        int result = clearBit(n, k);
        
        System.out.println("Number before clearing bit: " + n);
        System.out.println("Number after clearing bit " + k + ": " + result);
    }
    static int clearBit(int n, int k) {
        int mask = 1 << (k - 1);  
        mask = ~mask;             
        return (n & mask);
    }
}
