public class OddEven {
    public static void oddEvenWithBit(int n){
        int x = 1;
        if ((n & x) == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddEvenWithBit(3);
        oddEvenWithBit(11);
        oddEvenWithBit(100);
        oddEvenWithBit(8);
    }
}
