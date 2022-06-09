import java.util.*;

public class Collection {
    int len, ar[];

    Collection(int l) {
        len = l;
        ar = new int[l];
    }

    void input() {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ARRAY ELEMENTS:");
        for (i = 0; i < len; i++)
            ar[i] = sc.nextInt();
    }

    void display() {
        int i;
        for (i = 0; i < len; i++)
            System.out.print(ar[i] + " ");
        System.out.println();
    }

    Collection common(Collection a) {
        Collection b = new Collection(len);
        int i, j, k = 0;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++)
                if (a.ar[i] == ar[j]) {
                    b.ar[k] = ar[i];
                    k++;
                }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        length = sc.nextInt();
        Collection ob1 = new Collection(length);
        Collection ob2 = new Collection(length);
        Collection ob3 = new Collection(length);
        ob1.input();
        System.out.println("FIRST ARRAY:");
        ob1.display();
        ob2.input();
        System.out.println("SECOND ARRAY:");
        ob2.display();
        ob3 = ob2.common(ob1);
        System.out.println("COMMON ELEMNTS:");
        ob3.display();
        sc.close();
    }
}