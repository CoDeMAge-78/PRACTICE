import java.util.*;

public class Queue {
    int front, rear, size, arr[];

    Queue(int n) {
        size = n;
        arr = new int[size];
        front = rear = -1;
    }

    void input(int data) {
        if (rear == -1) {
            front = rear = 0;
            arr[rear] = data;
        } else if (rear == (size - 1))
            System.out.println("QUEUE IS OVERFLOW");
        else {
            rear++;
            arr[rear] = data;
        }
    }

    void delete() {
        if (front == -1)
            System.out.println("QUEUE IS UNDERFLOW");
        else if (front == rear) {
            System.out.println("DELETED DATA: " + arr[front]);
            front = rear = -1;
        } else {
            System.out.println("DELETED DATA: " + arr[front]);
            front++;
        }
    }

    void display() {
        int i;
        if (front == -1 && rear == -1)
            System.out.println("QUEUE IS EMPTY");
        else {
            System.out.println("ENTERED DATA:");
            for (i = front; i <= rear; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, l, d;
        boolean c = true;
        System.out.println("ENTER ARRAY SIZE:");
        l = sc.nextInt();
        Queue obj = new Queue(l);
        while (c) {
            System.out.println("ENTER 1 TO ENTER DATA");
            System.out.println("ENTER 2 TO DELETE DATA");
            System.out.println("ENTER 3 TO DISPLAY QUEUE");
            System.out.println("ENTER 4 TO TERMINATE THE PROGRAM");
            System.out.println("ENTER YOUR CHOICE:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ENTER DATA:");
                    d = sc.nextInt();
                    obj.input(d);
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    c = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
        sc.close();
    }
}