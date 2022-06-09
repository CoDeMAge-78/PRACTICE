import java.util.*;

public class Hailstone {
    void sequence(int n) {
        System.out.print(" ");
        if (n == 1)
            System.out.println(1);
        else if (n % 2 == 0) {
            System.out.print(n);
            sequence(n / 2);
        } else {
            System.out.print(n);
            sequence((3 * n) + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number:");
        num = sc.nextInt();
        Hailstone ob = new Hailstone();
        ob.sequence(num);
        sc.close();
    }
}
