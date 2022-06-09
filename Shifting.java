import java.util.*;

public class Shifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, r, c;
        System.out.println("Enter the number of cloumns:");
        c = sc.nextInt();
        System.out.println("Enter Tthe number of rows:");
        r = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the array elemnts:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        int t[] = new int[c];
        for (j = 0; j < c; j++)
            t[j] = arr[0][j];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (i < r - 1)
                    arr[i][j] = arr[i + 1][j];
                else
                    arr[i][j] = t[j];
            }
            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }
    }
}