import java.util.*;

public class Circular_Queue {
    int front, rear, size, ar[];

    Circular_Queue(int s) {
        size = s;
        ar = new int[s];
        front = rear = -1;
    }

    void insert(int data) {
        System.out.println("ENTER DATA IN THE QUEUE:");
        if (rear == -1) {
            front = rear = 0;
            ar[front] = data;
        } else if ((front == 0 && rear == size - 1) || front - 1 == rear)
            System.out.println("QUEUE IS QVERFLOWED");
        else if (front > 0 && rear == size - 1) {
            rear = 0;
            ar[rear] = data;
        } else {
            rear++;
            ar[rear] = data;
        }
    }

    void delete() {
        if (front == -1)
            System.out.println("QUEUE IS UNDERFLOWED");
        else if (front == rear) {
            System.out.println("DELETED ELEMENT:" + ar[front]);
            front = rear = -1;
        } else if (front == size - 1 && rear < front) {
            System.out.println("DELETED ELEMENT" + ar[front]);
            front = 0;
        } else {
            System.out.println("DELETED ELEMENT:" + ar[front]);
            front++;
        }
    }

    void display() {
        int i;
        if (front == -1 && rear == -1)
            System.out.println("QUEUE IS EMPTY");
        else {
            System.out.println("ELEMENTS ARE:");
            if (front <= rear) {
                for (i = front; i <= rear; i++)
                    System.out.print(ar[i] + " ");
            } else {
                for (i = 0; i < size; i++)
                    System.out.print(ar[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, length, data;
        boolean c = true;
        System.out.println("ENTER ARRAY SIZE:");
        length = sc.nextInt();
        Circular_Queue ob = new Circular_Queue(length);
        while (c) {
            System.out.println("ENTER 1 TO INSERTION");
            System.out.println("ENTER 2 TO DELETEION");
            System.out.println("ENTER 3 TO DISPLAY");
            System.out.println("ENTER 4 TO TERMINATION OF THE PROGRAM");
            System.out.println("ENTER YOUR CHOICE:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ENTER DATA IN THE ARRAY");
                    data = sc.nextInt();
                    ob.insert(data);
                    break;
                case 2:
                    ob.delete();
                    break;
                case 3:
                    ob.display();
                    break;
                case 4:
                    c = false;
                    break;
                default:
                    System.out.println("INVALID LIFE CHOICES");
            }
        }
        sc.close();
    }
}