import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tab tab = new Tab();
        tab.read();
        tab.print();
    }
}

class SmallTabs extends Tab {

    public int[] divide() {
        for (int i = 0; i < n * n; i++) {

        }
        return;
    }

}

class Tab {
    int n;
    int[][] matrix;

    public int[][] read() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        matrix = new int[n * n][n * n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return matrix;
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
