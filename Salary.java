import java.util.*;

public class Salary extends Employee {
    float da, hra, spl, tsal;

    Salary() {
        super();
        da = 0;
        hra = 0;
        spl = 0;
        tsal = 0;
    }

    Salary(int em, double bs, float d, float h, float s) {
        super(em, bs);
        da = d;
        hra = h;
        spl = s;
    }

    void calculate_sal() {
        tsal = (float) bsal + da + hra + spl;
    }

    void show_display() {
        System.out.println("EMPLOYEE DETAILS:");
        System.out.println(da);
        System.out.println(hra);
        System.out.println(spl);
        System.out.println(tsal);
    }

    public static void main(String[] args) {
        int emnum;
        double basic_salary;
        float ad, arh, lsp;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER EMPLOYEE NUMBER:");
        emnum = sc.nextInt();
        System.out.println("ENTER BASIC SALARY:");
        basic_salary = sc.nextDouble();
        System.out.println("ENTER DEARNESS ALLOWENCE:");
        ad = sc.nextFloat();
        System.out.println("ENTER HOUSE RENT ALLOWENCE:");
        arh = sc.nextFloat();
        System.out.println("ENTER SPECIAL ALLOWENCE:");
        lsp = sc.nextFloat();
        Salary ob = new Salary(emnum, basic_salary, ad, arh, lsp);
        ob.calculate_sal();
        ob.show_display();
        sc.close();
    }
}