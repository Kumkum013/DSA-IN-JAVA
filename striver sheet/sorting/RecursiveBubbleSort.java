

public class RecursiveBubbleSort {
    static void bubbleSort(int[] arr, int n)
    {
        // base condition
        if(n==1)
        {
            return;
        }

        // one complete bubble sort pass
        for(int j=0;j<n-1;j++)
        {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
         // recursively sort the remaining part
         bubbleSort(arr, n-1);

    }
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        int n = arr.length;
        bubbleSort(arr, n);
        for(int num : arr)
        {
            System.out.println(num +"");
        }
    }
    
}
