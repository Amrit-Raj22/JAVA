public class AdditionOfMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 }, { 5, 6, 7 }, { 6, 2, 9 } };
        int[][] matrix2 = { { 6, 5, 2 }, { 9, 8, 3 }, { 0, 9, 8 } };
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] += matrix2[i][j];
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

    }

}
