

public class BubbleSort {
 public static void main(String[] args) {
     int[] arr = {5,3,4,1,2};
     int n= arr.length;
     for (int i = 0; i < 10; i++) {
        for(int j=0; j<n-i-1;j++ )
        {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
         
     }
 for (int num : arr) {
            System.out.print(num + " ");

 }   
}
}
