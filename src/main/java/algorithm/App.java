package algorithm;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        //----------MATRIX---------------//
        int matrixElements[] = {1, 2, 3, 4};
        int augumentedMatrixElements[] = { 2, 1, -1, 8, -3, -1, 2, -11, -2, 1, 2, -3};
        Matrix matrix = new Matrix(2, 2, matrixElements);
        Matrix matrix2 = new Matrix(2, 2, matrixElements);
        Matrix augumentedMatrix = new Matrix(3,3, augumentedMatrixElements);

        //System.out.println(matrix.get(2,2));
        // matrix.set(2,2,0);
        //  System.out.println(matrix.get(2,2));

        //----------VECTOR---------------//
        int dimensions = 4;
        int vectorElements[] = {1, 2, 3, 4};
        int vectorElements2[] = {4, 6, 7, 9};
        //Vector vector = new Vector(dimensions, vectorElements);
      //  Vector vector2 = new Vector(dimensions, vectorElements2);


        // System.out.println(vector.get(0));
        // vector.set(0, 0);
        // System.out.println(vector.get(0));

        //----------LINEAR-ALGEBRA---------------//
        //LinearAlgebra.transpose(matrix);
        //LinearAlgebra.transpose(vector);
        //LinearAlgebra.sum(matrix, matrix2);
        //LinearAlgebra.sum(vector, vector2);
        //LinearAlgebra.times(4,matrix);
        //LinearAlgebra.times(4, vector);
        //LinearAlgebra.dot(matrix,matrix2);
       // LinearAlgebra.solve




    }
}
