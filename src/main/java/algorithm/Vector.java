package algorithm;

public class Vector {

    private int vector[];
    private int dimension;

    public Vector(int dim, int[] elements) {
        vector = new int[dim];
        this.dimension = dim;

        for (int i = 0; i < dim; i++) {
            vector[i] = elements[i];
            System.out.println("elemento Vetor: " + vector[i]);
        }
    }

    public int get(int index) {

        return vector[index];
    }

    public void set(int index, int element) {

        vector[index] = element;

    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
