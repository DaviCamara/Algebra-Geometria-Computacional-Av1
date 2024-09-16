package algorithm;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        //imprimir o set e resolver o solver
        //----------MATRIX---------------//
        int matrixElements[] = {1, 2, 3, 4};
        int matrixElements2[] = {5, 6, 7, 8};
        int[] gassJaacobiElements = {4, 1, 2, 1, 5, 1, 2, 1, 3};

        Matrix matrix = new Matrix(2, 2, matrixElements);
        Matrix matrix2 = new Matrix(2, 2, matrixElements2);
        Matrix gassJaacobiMatrix = new Matrix(3, 3, gassJaacobiElements);

        matrix.printMatrix();
        //System.out.println(matrix.get(2,2));
        matrix.set(2, 2, 0);
        matrix.printMatrix();

        //imprimiri matrix toda e trocar por 0
        //System.out.println(matrix.get(2,2));


        //----------GASS-JACOBI----------//
        double[] b = {4, 7, 3}; // Constants vector (b)
        double[] initialGuess = {0, 0, 0}; // Initial guess for solution

        int maxIterations = 100;
        double tolerance = 1e-6;
        //----------VECTOR---------------//
        int dimensions = 3;
        int vectorElements[] = {1, 2, 3};
        int vectorElements2[] = {4, 5, 6};
        Vector vector = new Vector(dimensions, vectorElements);
        Vector vector2 = new Vector(dimensions, vectorElements2);


        // System.out.println(vector.get(0));
        vector.printVector();
        vector.set(0, 0);
        vector.printVector();
        // System.out.println(vector.get(0));

        //----------LINEAR-ALGEBRA---------------//
        //LinearAlgebra.transpose(matrix);
        LinearAlgebra.transpose(vector);
        //LinearAlgebra.sum(matrix, matrix2);
        //LinearAlgebra.sum(vector, vector2);
        //LinearAlgebra.times(4,matrix);
        //LinearAlgebra.times(4, vector);
        //LinearAlgebra.dot(matrix, matrix2);
        //LinearAlgebra.solve


        double[] solution = LinearAlgebra.gaussJacobi(gassJaacobiMatrix, b, initialGuess, maxIterations, tolerance);


    }
}
