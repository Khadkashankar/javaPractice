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

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) { //find the min pos
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length - 1; i++) {
            int temp = arr[i];
            int j = i - 1;
            //findig the correct position to insert
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            //insertion
            arr[j + 1] = temp;
        }
    }

    public static void CountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;                
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 8, 3, 9, 5, 7 };
        // BubbleSort(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        CountingSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
