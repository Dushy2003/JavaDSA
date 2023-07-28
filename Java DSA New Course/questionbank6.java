public class questionbank6 {

  public static void printmatrix(int matrix[][]) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    //     // print the number of 7s that are in the 2d array
    //     int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
    //     int countof7 = 0;

    //     for (int i = 0; i < array.length; i++) {
    //       for (int j = 0; j < array[0].length; j++) {
    //         if (array[i][j] == 7) {
    //           countof7++;
    //         }
    //       }
    //     }
    //     System.out.println("Count of 7 is =" + countof7);

    //     // print out sum of the numbers in the second row of the "nums" array

    //     int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
    //     int sum = 0;

    //     // sum of 2nd row elements
    //     for (int j = 0; j < nums.length; j++) {
    //       sum += nums[1][j];
    //     }
    //     System.out.println("sum of 2nd row elements =" + sum);
    //   }

    // write a program to find a transposed of a matrix
    int matrix[][] = { { 2, 4, 5 }, { 3, 6, 7 } };

    //print original matrix
    System.out.println("Original matrix is ");
    printmatrix(matrix);

    // transposed matrix

    int row = 2;
    int col = 3;
    int transposed[][] = new int[col][row];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        transposed[j][i] = matrix[i][j];
      }
    }

    // print transposed matrix
    System.out.println("Transpose matrix is ");
    printmatrix(transposed);
  }
}
