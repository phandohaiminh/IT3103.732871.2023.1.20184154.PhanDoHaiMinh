// Ho ten: Phan Do Hai Minh
// MSSV  : 20184154
// Bai 6.6
// Write a Java program to add two matrices of the same size.

import java.util.Scanner;

public class AddTwoMatrices {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int i, j;

    System.out.print("Enter number of rows: ");
    int row = keyboard.nextInt();
    System.out.print("Enter number of columns: ");
    int column = keyboard.nextInt();

    int[][] matrix1 = new int[row][column];
    int[][] matrix2 = new int[row][column];
    int[][] sum = new int[row][column];

    System.out.println("Enter the value of first matrix: ");
    for (i = 0; i < row; i++)
      for (j = 0; j < column; j++) {
        matrix1[i][j] = keyboard.nextInt();
      }

    System.out.println("Enter the value of second matrix: ");
    for (i = 0; i < row; i++)
      for (j = 0; j < column; j++) {
        matrix2[i][j] = keyboard.nextInt();
        sum[i][j] = matrix1[i][j] + matrix2[i][j];
      }

    System.out.println("The first matrix: ");
    printMatrix(matrix1);

    System.out.println("The second matrix: ");
    printMatrix(matrix2);

    System.out.println("The sum of two matrices: ");
    printMatrix(sum);
  }

  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }
  }
}