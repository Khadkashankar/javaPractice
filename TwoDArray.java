import java.util.Scanner;

public class TwoDArray {
    public static boolean Search(int matrix[][], int key) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("element found at index " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("element not found !");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int m=matrix.length;
        int n=matrix[0].length;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //searching in 2DArray
        Search(matrix, 10);
    
    }
    
}
