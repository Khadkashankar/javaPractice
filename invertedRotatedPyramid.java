public class invertedRotatedPyramid {
    
    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
    
        inverted_rotated_half_pyramid(4);
}


}
