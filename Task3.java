package lesson1;

public class Task3 {
    public static void main(String [] args) {
        int levels = 9;
        int maxwidth = 2 * levels - 1;
        for (int level = 1; level < levels+1; level++) {
            for (int i = levels; i > level; i--) {
                System.out.print(" ");
            }
            for (int n = 1; n < level + 1; n++) {
                System.out.print(n);
            }
            for (int n = level - 1; n > 0; n--) {
                System.out.print(n);
            }
            for (int i = levels+level; i < maxwidth+1; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
