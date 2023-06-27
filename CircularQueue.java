import java.util.Scanner;
public class CircularQueue {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int [] arr=new int [size];
    int front=-1,rear=-1;

    void display()
    {
        if(isEmpty())
        {
            System.out.println("EMPTY");
        }
        else {
            int i=front;
            while(true)
            {
                System.out.print("|"+arr[i]+"|");
                if(i==rear)
                {
                    break;
                }
                i=(i+1)%size;
            }
        }
    }
    boolean isEmpty()
    {
        if(front==-1 && rear==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isFull()
    {
        if((front==0 && rear==size-1)||(front==rear+1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void enqueue()
    {
        if(!isFull())
        {
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            System.out.print("Enter a value to be inserted:");
            arr[rear] = sc.nextInt();
        }
        else
        {
            System.out.println("OVERFLOW");
        }
    }

    void peek()
    {
        System.out.println(front);
    }

    void dequeue()
    {
        if (!isEmpty()) {
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else {
                front = (front + 1) % size;
            }
        }
        else{
            System.out.println("UNDERFLOW");
        }
    }
    public static void main(String[] args) {
        CircularQueue c=new CircularQueue();
        System.out.println("1.Display\n2.Enqueue\n3.Dequeue\n4.isEmpty\n5.isFull\n6.Peek\n7.Quit");
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter case:");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    c.display();
                    break;

                case 2:
                    c.enqueue();
                    break;

                case 3:
                    c.dequeue();
                    break;

                case 4:
                    c.isEmpty();
                    if(c.isEmpty())
                    {
                        System.out.println("EMPTY");
                    }
                    else
                    {
                        System.out.println("Not EMPTY");
                    }
                    break;

                case 5:
                    c.isFull();
                    if(c.isFull())
                    {
                        System.out.println("FULL");
                    }
                    else
                    {
                        System.out.println("Not FULL");
                    }
                    break;

                case 6:
                    c.peek();
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter valid choice");
            }
            System.out.println();

        }
    }
}