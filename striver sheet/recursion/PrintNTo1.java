

public class PrintNTo1 {

    static void printNumber(int i) {

        // Base Condition
        if (i == 0) {
            return;
        }

        System.out.println(i);

        // Recursive Call
        printNumber(i - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        printNumber(n);

    }
}