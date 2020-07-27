public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        System.out.println(numbers[1]);

        int[][] matrice = {{1, 2, 3, 55, 23, 2},
                {4, 5, 6, 2, 5},
                {7, 8}};


        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] i : matrice) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
