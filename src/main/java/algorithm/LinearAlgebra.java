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

    public static Vector transpose(Vector vector) {

        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println("Elemento transposto:" + vector.get(i));
        }
        return vector;

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
        }

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

    public void solve(Matrix augmentedMatrix) {
//        int equacoes = augmentedMatrix.getRowSize();
//        int variaveis = augmentedMatrix.getColSize();
//
//        if (variaveis != equacoes + 1) {
//            System.out.println("numero de colunas na matrix ampliada  deve ser igual ao numero de linhas + 1");
//        }
//
//        for (int i = 0; i < equacoes; i++) {
//            // Find the pivot row and swap
//            int pivot = i;
//            for (int k = i + 1; k < equacoes; k++) {
//                if (Math.abs(augmentedMatrix.get(k + 1, i + 1)) > Math.abs(augmentedMatrix.get(pivot + 1, i + 1))) {
//                    pivot = k;
//                }
//            }
//
//            // Swap rows
//            for (int j = 0; j < variaveis; j++) {
//                int temp = augmentedMatrix.get(i + 1, j + 1);
//                augmentedMatrix.set(i + 1, j + 1, augmentedMatrix.get(pivot + 1, j + 1));
//                augmentedMatrix.set(pivot + 1, j + 1, temp);
//            }
//
//            // Make the pivot element 1 and eliminate the column
//            int pivotElement = augmentedMatrix.get(i + 1, i + 1);
//            if (pivotElement == 0) {
//                throw new Exception("The system does not have a unique solution.");
//            }
//            for (int j = 0; j < variaveis; j++) {
//                augmentedMatrix.set(i + 1, j + 1, augmentedMatrix.get(i + 1, j + 1) / pivotElement);
//            }
//            for (int k = 0; k < equacoes; k++) {
//                if (k != i) {
//                    int factor = augmentedMatrix.get(k + 1, i + 1);
//                    for (int j = 0; j < variaveis; j++) {
//                        augmentedMatrix.set(k + 1, j + 1, augmentedMatrix.get(k + 1, j + 1) - factor * augmentedMatrix.get(i + 1, j + 1));
//                    }
//                }
//            }
//        }
//
//        // Extract the solution from the last column
//        int[] solutions = new int[equacoes];
//        for (int i = 0; i < equacoes; i++) {
//            solutions[i] = augmentedMatrix.get(i + 1, equacoes + 1);
//        }
//
//        return new Matrix(equacoes, 1, solutions);
//    }
    }
}
