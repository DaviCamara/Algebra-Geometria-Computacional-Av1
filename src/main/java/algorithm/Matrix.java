package algorithm;

public class Matrix {

    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols, int[] elements) throws Exception {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
//        rows -> A quantidade de linhas da matriz.
//        cols -> A quantidade de colunas da matriz.
//        elements -> Um array com os elementos da matriz.

        //elements.lenght = 8
        //rows x cols = elements.lenght

        if(rows * cols != elements.length) {
            throw new Exception("Quantidade de elementos do array diferente da ordem da Matrix");
        }

        int ponteiroVetor = 0;
        //percorre linhas
        for (int i = 0; i < rows; i++) {
            //percorre as colunas
            for (int j = 0; j < cols; j++) {

                //Acessa elementos para preencher a matriz
                this.matrix[i][j] = elements[ponteiroVetor++];

                System.out.println("element: " + this.matrix[i][j]);
            }
        }

    }

    public int get(int row, int col) {

        return this.matrix[row-1][col-1];
    }

    public void set(int row,int col, int element) {
            this.matrix[row-1][col-1] = element;
    }

    public int getColSize(){
        return this.cols;
    }

    public int getRowSize(){
        return this.rows;
    }


}
