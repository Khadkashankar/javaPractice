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

    public static void reverseArray(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            //classical swap
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;

        }
    }

    public static void printPairs(int numbers[]) {

        int total_pairs = 0;//count the total pairs 
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println(total_pairs);
    }

    public static void printSubarray(int numbers[]) {
        int total_pairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                total_pairs++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(total_pairs);
    }

    public static void printSubarrayMaxSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.println("max sum = " + maxSum);
    }

    public static void prefixArrayMaxSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];//the first element of original array is equal to the first element of prfix array
        //calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        //now calculating the maxsum of prefix array
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
 
    public static void kadanes(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max sum = "+ maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = { 1,-2,6,-1,3 };
        // int key = 10;
        //     int index = linearSearch(numbers, key);
        //     if(index==-1){
        //         System.out.println("not found");
        //             }
        //             else{
        //                 System.out.println("key is at index "+index);
        //             }
        // int max = maxFromArray(numbers);
        // System.out.println("the largest number from array is " + max);
        //binary search
        // int index = binarySearch(numbers, key);
        //     System.out.println("index of "+key+" is "+ index);

        //revers an array
        // reverseArray(numbers);
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i]+" ");

        //total pairs
        // printPairs(numbers);

        //print subarrays
        //printSubarray(numbers); 

        //max subarray sum
        //  printSubarrayMaxSum(numbers);

        //max subarray sum 
        //prefixArrayMaxSum(numbers);

        //kadanes
        kadanes(numbers);
    }
}

