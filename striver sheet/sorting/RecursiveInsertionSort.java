public class RecursiveInsertionSort {

    static void insertionSort(int[] arr, int n) {

        // Base condition
        if (n <= 1) {
            return;
        }

        // Sort first n-1 elements
        insertionSort(arr, n - 1);

        // Store the last element
        int key = arr[n - 1];

        // Start from the element before key
        int j = n - 2;

        // Shift larger elements to the right
        while (j >= 0 && arr[j] > key) {

            arr[j + 1] = arr[j];

            j--;
        }

        // Put key in its correct position
        arr[j + 1] = key;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        insertionSort(arr, arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}