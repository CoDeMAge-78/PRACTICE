import java.util.*;

/*
PROGRAM TO EXCHANGE THE FIRST AND LAST ALHPABETS IN WORDS
*/
public class Exchange {
    int size;
    String sent, rev;

    Exchange() {
        size = 0;
        sent = "";
        rev = "";
    }

    void read_sentence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence:");
        sent = sc.nextLine();
        size = sent.length();
        sc.close();
    }

    void ex_first_last() {
        char ch;
        int i, l;
        String s1 = "", s2 = "", s3 = "";
        for (i = 0; i < size; i++) {
            ch = sent.charAt(i);
            s1 += ch;
            if (ch == ' ') {
                l = s1.length();
                if (s1.length() == 1)
                    s3 += " " + ch;
                else if (s1.length() == 2)
                    s3 += s1.charAt(1) + s1.charAt(0);
                else {
                    s2 += s1.substring(1, l);
                    s3 = " " + s1.charAt(l - 1) + s2 + s1.charAt(0);
                }
            }
            s1 = "";
        }
        rev = s3;
    }

    void display() {
        System.out.println(sent);
        ex_first_last();
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Exchange ob = new Exchange();
        ob.read_sentence();
        ob.ex_first_last();
        ob.display();
    }
}
