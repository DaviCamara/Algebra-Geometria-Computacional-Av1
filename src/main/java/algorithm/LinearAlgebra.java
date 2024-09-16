package algorithm;

import java.util.Arrays;

public class LinearAlgebra {

    public static Matrix transpose(Matrix matrix) throws Exception {

        //criar nova matrix com dimensões corretas

        //int[][]transposedMatrix = new int[matrix.getRowSize()][matrix.getColSize()];
        int[] matrixPlaceholder = new int[matrix.getColSize() + matrix.getRowSize()];

        Matrix transposedMatrix = new Matrix(matrix.getColSize(), matrix.getRowSize(), matrixPlaceholder);

        //int indexPLaceholder = 0;
        for (int i = 1; i <= matrix.getRowSize(); i++) {
            for (int j = 1; j <= matrix.getColSize(); j++) {

                //matrixPlaceholder[indexPLaceholder] = matrix.get(i,j);
                transposedMatrix.set(i, j, matrix.get(j, i));
                System.out.println("Elemento transposto:" + transposedMatrix.get(i, j));
            }
        }


        return transposedMatrix;
    }

    public static void transpose(Vector vector) {
        System.out.println("[");
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println(" " + vector.get(i));
        }
        System.out.println("]");
    }

    public static Matrix sum(Matrix matrix1, Matrix matrix2) throws Exception {
        if (matrix1.getColSize() != matrix2.getRowSize()) {
            System.out.println("não é possível somar as matrizes.");
        } else {
            int rows = matrix1.getRowSize();
            int cols = matrix1.getColSize();
            int[] elementsSum = new int[rows * cols];

            int pointer = 0;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    elementsSum[pointer++] = matrix1.get(i, j) + matrix2.get(i, j);
                }
            }

            return new Matrix(rows, cols, elementsSum);

        }
        return null;
    }

    public static Vector sum(Vector vector1, Vector vector2) {
        if (vector1.getDimension() != vector2.getDimension()) {
            System.out.println("não é possível somar as matrizes.");
        } else {
            int dimension = vector1.getDimension();
            int[] resultElements = new int[dimension];
            //int pointer = 0;
            for (int i = 0; i < dimension; i++) {
                resultElements[i] = vector1.get(i) + vector2.get(i);
            }

            return new Vector(dimension, resultElements);
        }
        return null;
    }

    public static Matrix times(int escalar, Matrix matrix) throws Exception {
        int[] resultElements = new int[matrix.getRowSize() * matrix.getColSize()];
        int pointer = 0;

        for (int i = 1; i <= matrix.getRowSize(); i++) {
            for (int j = 1; j <= matrix.getColSize(); j++) {
                resultElements[pointer++] = matrix.get(i, j) * escalar;
            }
        }
        return new Matrix(matrix.getRowSize(), matrix.getColSize(), resultElements);
    }

    public static Vector times(int escalar, Vector vector) {
        int[] resultElements = new int[vector.getDimension()];

        for (int i = 0; i < vector.getDimension(); i++) {
            resultElements[i] = vector.get(i) * escalar;
        }

        return new Vector(vector.getDimension(), resultElements);
    }

    public static Matrix dot(Matrix matrix1, Matrix matrix2) throws Exception {
        if (matrix1.getColSize() != matrix2.getRowSize()) {
            System.out.println("O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
        } else {

            int rowsSizeMAtrix1 = matrix1.getRowSize();
            int rowSizeMatrix2 = matrix2.getRowSize();
            int colsSizeMAtrix2 = matrix2.getColSize();

            int[] resultElements = new int[rowsSizeMAtrix1 * colsSizeMAtrix2];
            int pointer = 0;


            for (int i = 0; i < rowsSizeMAtrix1; i++) {
                for (int j = 0; j < colsSizeMAtrix2; j++) {
                    int sum = 0;
                    for (int k = 0; k < rowSizeMatrix2; k++) {
                        sum += matrix1.get(i + 1, k + 1) * matrix2.get(k + 1, j + 1);
                    }
                    resultElements[pointer++] = sum;
                }
            }
            return new Matrix(rowsSizeMAtrix1, colsSizeMAtrix2, resultElements);
        }
        return null;
    }

    public static double[] gaussJacobi(Matrix A, double[] b, double[] initialGuess, int maxIterations, double tolerance) throws Exception {
        int n = A.getRowSize();
        double[] x = Arrays.copyOf(initialGuess, n);
        double[] xNew = new double[n];

        for (int iteration = 0; iteration < maxIterations; iteration++) {
            for (int i = 0; i < n; i++) {
                double sum = 0;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        sum += A.get(i + 1, j + 1) * x[j];
                    }
                }
                xNew[i] = (b[i] - sum) / A.get(i + 1, i + 1);
            }

            // Check for convergence
            double maxDifference = 0;
            for (int i = 0; i < n; i++) {
                maxDifference = Math.max(maxDifference, Math.abs(xNew[i] - x[i]));
            }

            if (maxDifference < tolerance) {
                System.out.println("Converged after " + (iteration + 1) + " iterations.");
                return xNew;
            }

            x = Arrays.copyOf(xNew, n);
        }

        throw new Exception("Gauss-Jacobi method did not converge within the maximum number of iterations.");
    }
}
