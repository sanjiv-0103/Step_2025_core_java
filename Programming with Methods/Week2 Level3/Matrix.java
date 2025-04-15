import java.util.Scanner;
import java.util.Random;
public class Matrix {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of rows and columns for the matrix: ");
int rows = sc.nextInt();
int cols = sc.nextInt();
int[][] matrix1 = createRandomMatrix(rows, cols);
int[][] matrix2 = createRandomMatrix(rows, cols);
System.out.println("Matrix 1:");
displayMatrix(matrix1);
System.out.println("Matrix 2:");
displayMatrix(matrix2);
System.out.println("\nMatrix Addition:");
int[][] additionResult = addMatrices(matrix1, matrix2);
displayMatrix(additionResult);
System.out.println("\nMatrix Subtraction:");
int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
displayMatrix(subtractionResult);
System.out.println("\nMatrix Multiplication:");
int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
displayMatrix(multiplicationResult);
System.out.println("\nMatrix Transpose of Matrix 1:");
int[][] transposeResult = transposeMatrix(matrix1);
displayMatrix(transposeResult);
if (rows == 2 && cols == 2) {
System.out.println("\nDeterminant of Matrix 1 (2x2): " + determinant2x2(matrix1));
System.out.println("Inverse of Matrix 1 (2x2):");
double[][] inverseMatrix1 = inverse2x2(matrix1);
displayMatrix(inverseMatrix1);
}
if (rows == 3 && cols == 3) {
System.out.println("\nDeterminant of Matrix 2 (3x3): " + determinant3x3(matrix2));
System.out.println("Inverse of Matrix 2 (3x3):");
double[][] inverseMatrix2 = inverse3x3(matrix2);
displayMatrix(inverseMatrix2);
}
sc.close();
}
public static int[][] createRandomMatrix(int rows, int cols) {
Random rand = new Random();
int[][] matrix = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
matrix[i][j] = rand.nextInt(10) + 1;
}
}
return matrix;
}
public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
int rows = matrix1.length;
int cols = matrix1[0].length;
int[][] result = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
result[i][j] = matrix1[i][j] + matrix2[i][j];
}
}
return result;
}
public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
int rows = matrix1.length;
int cols = matrix1[0].length;
int[][] result = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
result[i][j] = matrix1[i][j] - matrix2[i][j];
}
}
return result;
}
public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
int rows = matrix1.length;
int cols = matrix2[0].length;
int[][] result = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
for (int k = 0; k < matrix1[0].length; k++) {
result[i][j] += matrix1[i][k] * matrix2[k][j];
}
}
}
return result;
}
public static int[][] transposeMatrix(int[][] matrix) {
int rows = matrix.length;
int cols = matrix[0].length;
int[][] result = new int[cols][rows];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
result[j][i] = matrix[i][j];
}
}
return result;
}
public static int determinant2x2(int[][] matrix) {
return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
}
public static int determinant3x3(int[][] matrix) {
int det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
- matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
+ matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
return det;
}
public static double[][] inverse2x2(int[][] matrix) {
double det = determinant2x2(matrix);
double[][] inverse = new double[2][2];
if (det != 0) {
inverse[0][0] = matrix[1][1] / det;
inverse[0][1] = -matrix[0][1] / det;
inverse[1][0] = -matrix[1][0] / det;
inverse[1][1] = matrix[0][0] / det;
}
return inverse;
}
public static double[][] inverse3x3(int[][] matrix) {
double det = determinant3x3(matrix);
double[][] inverse = new double[3][3];
if (det != 0) {
inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / det;
inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / det;
inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / det;
inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / det;
inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / det;
inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / det;
inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / det;
inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / det;
inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / det;
}
return inverse;
}
public static void displayMatrix(int[][] matrix) {
for (int[] row : matrix) {
for (int elem : row) {
System.out.print(elem + "\t");
}
System.out.println();
}
}
public static void displayMatrix(double[][] matrix) {
for (double[] row : matrix) {
for (double elem : row) {
System.out.print(elem + "\t");
}
System.out.println();
}
}
}