import java.util.Arrays;

// reverse the element the array list
public class Reverse {
    void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        int[] array = {1, 2, 3, 4, 5};
        reverse.reverseArray(array);
    }
}