import java.util.*;

public class Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n, sum = 0;
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        int ar[][] = new int[n][n];
        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                ar[i][j] = sc.nextInt();
        }
        System.out.println("Enterd array:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(ar[i][j] + " ");
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j || i == n - j - 1)
                    sum += ar[i][j];
            }
        }
        System.out.println("Sum of the diagonals:" + sum);
        sc.close();
    }
}