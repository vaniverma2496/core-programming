import java.util.Random;

public class MatrixOperations {

    // Method to generate a random matrix
    public static double[][] generateRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10) + 1; // Random values 1-10
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    // Matrix addition
    public static double[][] addMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // Matrix subtraction
    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // Matrix multiplication
    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    // Transpose of matrix
    public static double[][] transposeMatrix(double[][] A) {
        int rows = A.length, cols = A[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = A[i][j];
        return transpose;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] A) {
        return A[0][0]*A[1][1] - A[0][1]*A[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] A) {
        return A[0][0]*(A[1][1]*A[2][2]-A[1][2]*A[2][1])
             - A[0][1]*(A[1][0]*A[2][2]-A[1][2]*A[2][0])
             + A[0][2]*(A[1][0]*A[2][1]-A[1][1]*A[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] A) {
        double det = determinant2x2(A);
        if (det == 0) return null;
        double[][] inv = {
            { A[1][1]/det, -A[0][1]/det },
            { -A[1][0]/det, A[0][0]/det }
        };
        return inv;
    }

    // Inverse of 3x3 matrix using adjoint method
    public static double[][] inverse3x3(double[][] A) {
        double det = determinant3x3(A);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] = (A[1][1]*A[2][2] - A[1][2]*A[2][1])/det;
        inv[0][1] = -(A[0][1]*A[2][2] - A[0][2]*A[2][1])/det;
        inv[0][2] = (A[0][1]*A[1][2] - A[0][2]*A[1][1])/det;
        inv[1][0] = -(A[1][0]*A[2][2] - A[1][2]*A[2][0])/det;
        inv[1][1] = (A[0][0]*A[2][2] - A[0][2]*A[2][0])/det;
        inv[1][2] = -(A[0][0]*A[1][2] - A[0][2]*A[1][0])/det;
        inv[2][0] = (A[1][0]*A[2][1] - A[1][1]*A[2][0])/det;
        inv[2][1] = -(A[0][0]*A[2][1] - A[0][1]*A[2][0])/det;
        inv[2][2] = (A[0][0]*A[1][1] - A[0][1]*A[1][0])/det;
        return inv;
    }

    public static void main(String[] args) {
        // Example for 3x3 matrices
        double[][] A = generateRandomMatrix(3,3);
        double[][] B = generateRandomMatrix(3,3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(A,B));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(A,B));

        System.out.println("\nA * B:");
        displayMatrix(multiplyMatrices(A,B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("\nDeterminant of A: " + determinant3x3(A));

        System.out.println("\nInverse of A:");
        double[][] invA = inverse3x3(A);
        if (invA != null) displayMatrix(invA);
        else System.out.println("Inverse does not exist (Determinant = 0)");
    }
}
