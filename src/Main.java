import Math.Gauss;
import Graph.*;

public class Main {

    private static void InitializeMatrix(double[][] matrix, int nrow, int ncol){
        for(int i = 0; i < nrow; i ++){
            for(int j = 0; j < ncol; j ++)
                matrix[i][j] = 10;
        }
    }

    private static void PrintMatrix(double[][] matrix, int nrow, int ncol){
        for(int i = 0; i < nrow; i ++){
            for(int j = 0; j < ncol; j ++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, world");
        /**
         * Test Gaussian Elimination
         */
        Gauss gauss = new Gauss();
        int nrow = 4;
        int ncol = 4;
        double[][] matrix = new double[nrow][ncol];
        InitializeMatrix(matrix, nrow, ncol);
        PrintMatrix(matrix, nrow, ncol);
        gauss.doGauss(matrix);
        PrintMatrix(matrix, nrow, ncol);

        /**
         * Test Graph packages
         */
        Graph graph = new Graph();
        graph.setNumVertice(3);
        graph.setNumEdege(5);

        System.out.println(graph.getNumVertice());
        System.out.println(graph.getNumEdege());
    }
}