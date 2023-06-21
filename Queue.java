import java.util.Scanner;

public class Queue {
    int front=-1,rear=-1;
    int size;
    int [] arr;
    Queue(int size) {
        this.size=size;
        arr=new int [size];
    }

    void display() //For displaying elements in queue
    {
        if(front==-1)
        {
            System.out.println("EMPTY");
        }
        else {
            for (int i = front; i <= rear; i++) {
                System.out.print("|" + arr[i] + "|");
            }
        }
    }

    boolean enqueue(int num) //For inserting elements in queue
    {
        if(rear==size-1)
        {
            System.out.println("OVERFLOW");
            return false;
        }
        else
        {
            rear++;
            if(rear==0)
            {
                front=0;
            }
            arr[rear] = num;
            return true;
        }
    }

    boolean dequeue()  //For removing elements from queue
    {
        if(front==-1)
        {
            System.out.println("UNDERFLOW");
            return false;
        }
        else
        {
            front++;
            if(front>rear)
            {
                front=-1;
                rear=-1;
            }
            return true;
        }
    }

    void isEmpty() //To check if queue is empty or not
    {
        if(rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Queue is not empty");
        }
    }
    void isFull() //To check if queue is full or not
    {
        if(rear==size-1)
        {
            System.out.println("Queue is full");
        }
        else
        {
            System.out.println("Queue is not full");
        }
    }
    void peek() //To display front element of queue
    {
        if(rear!=-1) {
            System.out.println(arr[front]);
        }
        else
        {
            System.out.println("Queue is empty");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of queue: ");
        int size=sc.nextInt();
        Queue s=new Queue(size);
        System.out.println("1.Display\n2.Enqueue\n3.Dequeue\n4.isEmpty\n5.isFull\n6.Peek\n7.Quit");
        while(true) {
            System.out.print("\nEnter case:");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    s.display();
                    break;

                case 2:
                    System.out.print("Enter a value to be inserted:");
                    int num= sc.nextInt();
                    s.enqueue(num);
                    break;

                case 3:
                    s.dequeue();
                    break;

                case 4:
                    s.isEmpty();
                    break;

                case 5:
                    s.isFull();
                    break;

                case 6:
                    s.peek();
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter valid choice");
            }
        }
    }
}