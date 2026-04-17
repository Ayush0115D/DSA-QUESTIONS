public class QuickSort {

    // partition function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];  // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index
    }

    // quicksort function
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pIdx = partition(arr, low, high);

            quickSort(arr, low, pIdx - 1);  // left part
            quickSort(arr, pIdx + 1, high); // right part
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        int n = arr.length;
        quickSort(arr, 0, n - 1);

        // print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}