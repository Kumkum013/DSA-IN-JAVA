// create a function that can calculate the sum  and product of all the elements in an array list
 public class SumArray {
    void calculateSumAndProduct(int[] array) {

        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            product *= array[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
    public static void main(String[] args) {
        SumArray sumArray = new SumArray();
        int[] array = {1, 2, 3, 4, 5};
        sumArray.calculateSumAndProduct(array);
    }
 }