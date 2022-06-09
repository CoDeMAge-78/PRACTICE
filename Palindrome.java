import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, count = 0;
        String s, s2, s3 = "";
        char ch;
        System.out.println("Enter any sentence:");
        s = sc.nextLine();
        StringTokenizer ob = new StringTokenizer(s);
        System.out.println("Number of palindromic words:");
        while (ob.hasMoreTokens()) {
            s2 = ob.nextToken();
            for (j = (s2.length() - 1); j >= 0; j--) {
                ch = s2.charAt(j);
                s3 += ch;
            }
            if (s2.equalsIgnoreCase(s3)) {
                System.out.println(s2);
                count++;
            }
            s3 = "";
        }
        System.out.println("Number of palindromic words: " + count);
        sc.close();
    }
}