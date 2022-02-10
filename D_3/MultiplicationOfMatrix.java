public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = { { 3, 4, 5, 6 },
                { 2, 6, 8, 1 },
                { 4, 6, 2, 1 } };
        int[][] matrix2 = { { 5, 4 },
                { 5, 6 },
                { 6, 7 },
                { 9, 1 } };
        int[][] res = new int[3][2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                // res[i][j] = 0;
                for (int k = 0; k < matrix2.length; k++) {
                    res[i][j] += matrix1[i][k] * matrix2[k][j];
                }

            }

            for (i = 0; i < res.length; i++) {
                for (int j = 0; j < res[i].length; j++) {
                    System.out.print(res[i][j] + " ");

                }
                System.out.println();
            }
        }
    }

}
