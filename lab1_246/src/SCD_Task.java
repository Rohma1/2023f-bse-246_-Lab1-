import java.util.Arrays;

class SCD_Task {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        SCD_Task ob = new SCD_Task();
        int arr[] = {64, 34, 25, 12};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        ob.bubbleSort(arr);

        System.out.println();
        
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
