import java.util.*;

public class Matrix {
    int r, c, ar[][];

    Matrix(int a, int b) {
        r = a;
        c = b;
        ar = new int[r][c];
    }

    void accept() {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ELEMENTS:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                ar[i][j] = sc.nextInt();
        }
    }

    void display() {
        int i, j;
        System.out.println("ELEMNT IN ARRAY:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                System.out.print(ar[i][j] + " ");
            System.out.println();
        }
    }

    void sum(Matrix a, Matrix b) {
        int i, j;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                ar[i][j] = a.ar[i][j] + b.ar[i][j];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        System.out.println("ENTER NUMBER OF ROWS AND COLUMNS:");
        row = sc.nextInt();
        column = sc.nextInt();
        Matrix ob1 = new Matrix(row, column);
        Matrix ob2 = new Matrix(row, column);
        Matrix ob3 = new Matrix(row, column);
        ob1.accept();
        ob2.accept();
        ob3.sum(ob1, ob2);
        System.out.println("FIRST MATRIX:");
        ob1.display();
        System.out.println("SECOND MATRIX:");
        ob2.display();
        System.out.println("SUM OF TWO MATRIX:");
        ob3.display();
        sc.close();
    }
}