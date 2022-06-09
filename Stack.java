import java.util.*;

public class Stack {
    int arr[], size, pointer;

    Stack(int s) {
        size = s;
        pointer = -1;
        arr = new int[size];
    }

    void push(int entry) {
        if (pointer == (size - 1))
            System.out.println("Stack is overflowed");
        else {
            pointer++;
            arr[pointer] = entry;
        }
    }

    void pop() {
        if (pointer == -1)
            System.out.println("Stack is underflowed");
        else {
            System.out.println("Deleted element of the array = " + arr[pointer]);
            pointer--;
        }
    }

    void peep() { // can be also display()
        int i;
        if (pointer == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Elements are:");
            for (i = 0; i <= pointer; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, data, choice;
        boolean c = true;
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        Stack ob = new Stack(n);
        while (c) {
            System.out.println("1. Push Operation");
            System.out.println("2. Pop Operation");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data for array:");
                    data = sc.nextInt();
                    ob.push(data);
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.peep();
                    break;
                case 4:
                    c = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}