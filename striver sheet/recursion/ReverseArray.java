

public class ReverseArray {
static void reverse(int[] arr,int i,int j)
{
    //base condition
    if(i >=j)
    {
        return;
    }

    // swap
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    // recursive call
    reverse(arr, i+1, j);
}

public static void main(String[] args) {
    int[] arr ={1,2,34};
    reverse(arr, 0, arr.length - 1);
    for(int num : arr)
    {
        System.out.println(num +"");
    }
}
    
}
