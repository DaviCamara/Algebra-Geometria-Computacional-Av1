package algorithm;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        //----------MATRIX---------------//
        int matrixElements[] = {1, 2, 3, 4};
        Matrix matrix = new Matrix(2, 2, matrixElements);

        //System.out.println(matrix.get(2,2));
        // matrix.set(2,2,0);
        //  System.out.println(matrix.get(2,2));

        //----------VECTOR---------------//
        int dimensions = 4;
        int vectorElements[] = {1, 2, 3, 4};
        //Vector vector = new Vector(dimensions, vectorElements);


        // System.out.println(vector.get(0));
        // vector.set(0, 0);
        // System.out.println(vector.get(0));

        //----------LINEAR-ALGEBRA---------------//
        LinearAlgebra.transpose(matrix);


    }
}
