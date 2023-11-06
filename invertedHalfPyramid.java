public class invertedHalfPyramid {
    
    public static void inverted_half_pyramid_withNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                //System.out.print(i); // to print 11111
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //inverted_half_pyramid_withNumbers(5);
        floyd_triangle(5);
    }
}
