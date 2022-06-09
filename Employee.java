public class Employee {
    protected int empn;
    protected double bsal;

    Employee() {
        empn = 0;
        bsal = 0.0;
    }

    Employee(int e, double b) {
        empn = e;
        bsal = b;
    }

    void salinfo() {
        System.out.println("EMPLOYEE NUMBER:" + empn);
        System.out.println("BASIC PAY:" + bsal);
    }
}
