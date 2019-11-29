import Math.Gauss;

public class Main {
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
        Gauss gauss = new Gauss();
        int nrow = 3;
        int ncol = 3;

        double[][] matrix = new double[3][3];
        for(int i = 0; i < nrow; i ++){
            for(int j = 0; j < ncol; j ++)
                matrix[i][j] = 10;
        }
        PrintMatrix(matrix, 3, 3);
        gauss.doGauss(matrix);
        PrintMatrix(matrix, 3, 3);
    }
}