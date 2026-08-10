public class MergeSort {

    static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);

        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;

        int k = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {

                temp[k] = arr[left];
                left++;

            } else {

                temp[k] = arr[right];
                right++;
            }

            k++;
        }

        while (left <= mid) {

            temp[k] = arr[left];

            left++;
            k++;
        }

        while (right <= high) {

            temp[k] = arr[right];

            right++;
            k++;
        }

        for (int i = 0; i < temp.length; i++) {

            arr[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}