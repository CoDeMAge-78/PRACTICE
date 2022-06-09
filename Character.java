import java.util.*;

/**
 * Character
 */
public class Character {

    void modify(String wd) {
        int i;
        char ch;
        String s = "";
        for (i = 0; i < wd.length(); i++) {
            ch = wd.charAt(i);
            if (ch == 'y')
                ch = 'a';
            else if (ch == 'Y')
                ch = 'A';
            else if (ch == 'z')
                ch = 'b';
            else if (ch == 'Z')
                ch = 'B';
            else
                ch += 2;
            s += ch;
        }
        System.out.println(s);

    }

    public static void main(String[] args) {
        Character obj = new Character();
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("ENTER ANY WORD IN MIXED CASE:");
        str = sc.next();
        obj.modify(str);
        sc.close();
    }
}