import java.util.*;

public class matrices {

  // search matrix number and return true or false
  // public static boolean search(int matrix[][],int key){
  //     for(int i=0;i<matrix.length;i++){
  //         for(int j=0;j<matrix[0].length;j++){
  //             if(matrix[i][j]==key){
  //             System.out.println(" Key is Found at cell ("+ i+","+j+")");
  //             return true;
  //             }
  //         }
  //     }
  //     System.out.println("Key not found");
  //     return false;
  // }

  // print largest and smallest number in the matrix
  // public static void smallandlarge(int matrix[][]){
  //     int largest = Integer.MIN_VALUE;
  //     int smallest = Integer.MAX_VALUE;

  //     for(int i=0;i<matrix.length;i++){
  //         for(int j=0;j<matrix[0].length;j++){
  //             if(largest < matrix[i][j]){
  //                 largest = matrix[i][j];
  //             }
  //             if(smallest > matrix[i][j]){
  //                 smallest = matrix[i][j];
  //             }
  //         }
  //     }
  //     System.out.println("Largest number in the matrix is  ="+largest);
  //     System.out.println("Smallest number in the matrix is ="+smallest);
  // }

  // print spiral matrix
  // public static void printspiral(int matrix[][]){
  //     int startrow =0;
  //     int endrow = matrix.length-1;
  //     int startcol = 0;
  //     int endcol = matrix[0].length-1;

  //     while(startrow<=endrow && startcol<=endcol){

  //         // top
  //         for(int j=startcol; j<=endcol;j++){
  //             System.out.print(matrix[startrow][j]+" ");
  //         }

  //         // right
  //         for(int i=startcol+1; i<=endrow;i++){
  //             System.out.print(matrix[i][endcol]+" ");
  //         }

  //         // Bottom
  //         for(int j=endcol-1; j>=startcol;j--){
  //             if(startrow==endrow){
  //                 break;
  //             }
  //             System.out.print(matrix[endrow][j]+" ");
  //         }

  //         // left
  //         for(int i=endrow-1; i>=startrow+1;i--){
  //             if(startcol==endcol){
  //                 break;
  //             }
  //             System.out.print(matrix[i][startcol]+" ");
  //         }

  //         startrow++;
  //         startcol++;
  //         endrow--;
  //         endcol--;
  //     }
  //     System.out.println();
  // }

  // print diagonal sum of matrix (un-optimized code) (by brute force method)
  // Time complexity = O(n`2)
  // public static int diagonalsum(int matrix[][]){
  //     int sum=0;
  //     for(int i=0;i<matrix.length;i++){
  //         for(int j=0;j<matrix[0].length;j++){
  //             if(i==j){
  //                 sum+=matrix[i][j];
  //             }
  //             else
  //             if(i+j==matrix.length-1){
  //                 sum+=matrix[i][j];
  //             }
  //         }
  //     }
  //     return sum;
  // }

  // Optimized code for diagonal sum
  //   public static int diagonalsum(int matrix[][]) {
  //     int sum = 0;

  //     for (int i = 0; i < matrix.length; i++) {
  //       // primary daigonal sum
  //       sum += matrix[i][i];

  //       // secondary diagonal sum
  //       if (i != matrix.length - 1 - i) {
  //         sum += matrix[i][matrix.length - 1 - i];
  //       }
  //     }
  //     return sum;
  //   }

  // Search in sorted matrix (using staircase technique)
  // starting point in this situation is right side top corner start
  //   public static boolean staircasesearch(int matrix[][], int key) {
  //     int row = 0;
  //     int col = matrix[0].length - 1;

  //     while (row < matrix.length && col >= 0) {
  //       if (matrix[row][col] == key) {
  //         System.out.println(
  //           "Key is found at index (" + row + " , " + col + " ) "
  //         );
  //         return true;
  //       } else if (key < matrix[row][col]) {
  //         col--;
  //       } else {
  //         row++;
  //       }
  //     }
  //     System.out.println("Key is not found ");
  //     return false;
  //   }

  public static boolean staircasesearch(int matrix[][], int key) {
    int row = matrix.length - 1;
    int col = 0;

    while (row > matrix.length && col < 0) {
      if (matrix[row][col] == key) {
        System.out.println("Key is found (" + row + " , " + col + ")");
        return true;
      } else if (row > matrix[row][col]) {
        row--;
      } else {
        col++;
      }
    }
    System.out.println("Key is not found ");
    return false;
  }

  public static void main(String args[]) {
    // int matrix[][] = new int[3][3];
    // int n = matrix.length , m=matrix[0].length;

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a Number (3*3) = ");
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){

    //         matrix[i][j] = sc.nextInt();
    //     }
    // }

    // // output
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         System.out.print(matrix[i][j]+" ");
    //     }
    //     System.out.println();
    // }

    // // search(matrix,5);

    // smallandlarge(matrix);

    // print spiral matrix
    // int matrix[][] = {{1,2,3,4},
    //                 {5,6,7,8},
    //                 {9,10,11,12},
    //                 {12,13,14,15}};

    // printspiral(matrix);

    // print diagonal sum of matrix
    // int matrix[][] = {
    //   { 1, 2, 3, 4 },
    //   { 5, 6, 7, 8 },
    //   { 9, 10, 11, 12 },
    //   { 13, 14, 15, 16 },
    // };

    // System.out.println(diagonalsum(matrix));

    // search in sorted matrix code
    int matrix[][] = {
      { 10, 20, 30, 40 },
      { 15, 25, 35, 45 },
      { 27, 29, 37, 48 },
      { 32, 33, 39, 50 },
    };

    int key = 48;

    System.out.println(staircasesearch(matrix, key));
  }
}
