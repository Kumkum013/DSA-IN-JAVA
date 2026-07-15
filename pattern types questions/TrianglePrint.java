public class TrianglePrint {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the triangle

        // for (int i = 0; i <=n; i++) {
        //     // Print leading spaces
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(); // Move to the next line after each row
            
        //     }
            
        // }

        // another triangle in the form of number
        
        // for (int i = 1; i <=n; i++) {
        //     // Print leading spaces
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println(); // Move to the next line after each row
            
        //     }
            
        // }

        // pattern3

         for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line after each row
            
            }


    }
}
