import java.util.*;

/**
 * Transarray
 */
public class Transarray {

    int m, n, ar[][];

    Transarray(int r, int c) {
        m = r;
        n = c;
        ar = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                ar[i][j] = sc.nextInt();
        }
    }

    void display() {
        int i, j;
        System.out.println("ELEMNT IN ARRAY:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                System.out.print(ar[i][j] + " ");
            System.out.println();
        }
    }

    void transpose(Transarray A) {
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                ar[j][i] = A.ar[i][j];

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        System.out.println("ENTER NUMBER OF ROWS AND COLUMNS:");
        row = sc.nextInt();
        column = sc.nextInt();
        Transarray ob1 = new Transarray(row, column);
        Transarray ob2 = new Transarray(row, column);
        System.out.println("ENTER THE ARRAY ELEMENTS:");
        ob1.input();
        System.out.println("THE ARRAY ELEMENTS ARE:");
        ob1.display();
        ob2.transpose(ob1);
        System.out.println("TRANSPOSED ARRAY:");
        ob2.display();
        sc.close();
    }
}