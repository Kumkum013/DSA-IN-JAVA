public class ReverseTriangle {
    public static void main(String[] args) {
        int n = 5;

        // for (int i = 1; i <= n; i++) {

        //     for (int j = 0; j < n - i + 1; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {

        //     for (int j = 0; j < n - i + 1; j++) {
        //         System.out.print(j + 1 + " " );
        //     }

        //     System.out.println();
        // }

        // print an equilateral triangle
        // for(int i=0; i<n; i++)
        // {
        //     for(int j=0; j<n-i-1; j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=0; j<2*i+1; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // print reverse equilateral triangle
        
        // for(int i = 1; i<=n; i++)
        // {
        //     // print space
        //     for(int j = 1; j<i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     // print stars
        //     for(int j = 1; j<=2*(n-i)+1; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // combinatuon of upward and downward triangle
        // for(int i=0; i<n; i++)
        // {
        //     for(int j=0; j<n-i-1; j++)
        //     {
        //         System.out.print(" ");
        //    }
        //     for(int j=0; j<2*i+1; j++)
        //     {
        //          System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        // // print reverse equilateral triangle
        
        // for(int i = 1; i<=n; i++)
        // {
        //     // print space
        //     for(int j = 1; j<i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     // print stars
        //     for(int j = 1; j<=2*(n-i)+1; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // combination of upward and downward  equilateral triangle vertex is towards right
    

        // // Increasing part
        // for (int i = 1; i <= n; i++) {

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // Decreasing part
        // for (int i = n - 1; i >= 1; i--) {

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

       // 2 isiscales triangle join through base
       // number
        

// for (int i = 1; i <= n; i++) {

//     // First inner loop
//     for (int j = 1; j <= i; j++) {
//         System.out.print(j);
//     }

//     // Space loop
//     for (int j = 1; j <= 2 * (n - i); j++) {
//         System.out.print(" ");
//     }

//     // Third inner loop
//     for (int j = i; j >= 1; j--) {
//         System.out.print(j);
//     }

//     System.out.println();
// }

//pattern of printing continous no
// int num = 1;
// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= i; j++) {
//             System.out.print(num + " ");
//             num++;
//         }
//         System.out.println();
        
//     }

// another pattern 

// for(int i = 0; i <= n; i++) {
//     for(char ch = 'A'; ch < 'A' + i; ch++) {
//         System.out.print(ch + " ");

//     }
//     System.out.println();
// }

// another pattern

// for(int i = 0; i <= n; i++) {
//     for(char ch = 'A'; ch < 'A' +(n- i -1); ch++) {
//         System.out.print(ch + " ");
//    }
//    System.out.println();
// }


// another pattern
// for(int i = 0; i <= n; i++) {
  
//      for(int j = 0; j <= i; j++) {
//           char ch =  (char)('A' + i);
//         System.out.print(ch + " ");
//         ch++;


// }
// System.out.println();
//     }

// another pattern
// for(int i = 0; i <= n; i++) {

//     // space

//     for(int j = 0; j < (n-i-1); j++) {
//         System.out.print(" ");
//     }
    // characters
//         char ch = 'A';
//         int breakPoint = (2*i+1) / 2;
//     for(int j = 0; j < (2*i+1); j++) {
//         System.out.print(ch);

//         if(j < breakPoint) {
//             ch++;
//         } else {
//             ch--;
//         }
//     }
//     System.out.println();
// }


// another pattern
// for(int i = 0; i <= n; i++) {
//     for(char ch = (char)('E' - i); ch <= 'E'; ch++) {
//         System.out.print(ch + " ");
//     }
//     System.out.println();
// }

// another pattern


        // for (int i = 1; i <= n; i++) {

        //     // Print stars on the left
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     // Print spaces in the middle
        //     for (int j = 1; j <= 2 * (n - i) - 1; j++) {
        //         System.out.print(" ");
        //     }

        //     // Print stars on the right
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     // Move to the next line
        //     System.out.println();
        // }



        // another pattern
        

        // Upper half
        // for (int i = 1; i <= n; i++) {

        //     // Left stars
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     // Middle spaces
        //     for (int j = 1; j <= 2 * (n - i) - 1; j++) {
        //         System.out.print(" ");
        //     }

        //     // Right stars
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // // Lower half
        // for (int i = n - 1; i >= 1; i--) {

        //     // Left stars
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     // Middle spaces
        //     for (int j = 1; j <= 2 * (n - i) - 1; j++) {
        //         System.out.print(" ");
        //     }

        //     // Right stars
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        // another pattern

        

       

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                // Print star on first row, last row,
                // first column, and last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } 
                else {
                    // Print space inside the rectangle
                    System.out.print(" ");
                }
            }

            // Move to next row
            System.out.println();
        }

        

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 7; j++) {

                if (i == 1 || i == n || j == 1 || j == 7) {
                    System.out.print("4");
                }
                else if (i == 2 || i == 4 || j == 2 || j == 6) {
                    System.out.print("3");
                }
                else {
                    System.out.print("2");
                }
            }

            System.out.println();
        }
    }
}



    

    

           


    
