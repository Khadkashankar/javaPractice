public class Sorting {

    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void SelectionSort(int arr[]) {
        
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
             int temp = arr[minPos];
                    arr[minPos] = arr[i];
                    arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 8, 3, 9, 5, 7 };
        // BubbleSort(arr);
        SelectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
