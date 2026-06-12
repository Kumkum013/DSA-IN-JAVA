// print pairs of elements in an array
public class PairsElement {
    void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println("(" + array[i] + ", " + array[j] + ")");
            }
        }
    }
    public static void main(String[] args) {
        PairsElement pairsElement = new PairsElement();
        int[] array = {1, 2, 3, 4, 5};
        pairsElement.printPairs(array);
    }
}