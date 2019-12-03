package lesson1;

public class Task4 {
    static int [][] matrix1 = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
    static int [][] matrix2 = new int [4][4];
    public static void main (String[] args) {
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x ++) {
                matrix2[x][y] = matrix1[y][x];
            }

        }
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                System.out.print(matrix1[y][x]);
            }
            System.out.println();
        }
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                System.out.print(matrix2[y][x]);
            }
            System.out.println();
        }
    }
}
