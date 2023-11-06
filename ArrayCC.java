public class ArrayCC {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static int maxFromArray(int numbers[]) {
        //  int max = 0;
        int max = Integer.MIN_VALUE;
        //int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {//right
                start = mid + 1;
            } else {//left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 12, 13, 8, 100, 48 };
            int key = 10;
        //     int index = linearSearch(numbers, key);
        //     if(index==-1){
            //         System.out.println("not found");
            //             }
            //             else{
                //                 System.out.println("key is at index "+index);
                //             }
                // int max = maxFromArray(numbers);
                // System.out.println("the largest number from array is " + max);
                int index = binarySearch(numbers, key);
                    System.out.println("index of "+key+" is "+ index);
    }
}
