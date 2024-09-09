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

    public void transpose(Vector vector) {

    }

    public void sum(Matrix matrix1, Matrix matrix2) {
    }

    public void sum(Vector vector1, Vector vector2) {
    }

    public void times(int escalar, Matrix matrix) {
    }

    public void times(int escalar, Vector vector) {
    }

    public void dot(Matrix matrix1, Matrix matrix2) {
    }

    public void solve(Matrix matrix) {

    }
}
