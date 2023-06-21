import java.util.Scanner;
public class Stack {
    int top=-1;
    int size;
    int [] arr;
    Stack(int size) {
        this.size=size;
        arr=new int [size];
    }
    void display() //For displaying elements in stack
    {
        if(top==-1)
        {
            System.out.println("EMPTY");
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println("|"+arr[i]+"|");
            }
        }
    }

    boolean push(int num) //For inserting elements in stack
    {
        if(top==size-1)
        {
            System.out.println("OVERFLOW");
            return false;
        }
        else
        {
            top++;
            arr[top]=num;
            return true;
        }
    }
    boolean pop() //For deleting elements from stack
    {
        if(top==-1)
        {
            System.out.println("UNDERFLOW");
            return false;
        }
        else
        {
            top--;
            return true;
        }
    }

    void isEmpty() //To check if stack is empty or not
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack is not empty");
        }
    }
    void isFull() //To check if stack is full or not
    {
        if(top==size-1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            System.out.println("Stack is not full");
        }
    }
    void peek() //To display top element of stack
    {
        if(top!=-1) {
            System.out.println(arr[top]);
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        int size=sc.nextInt();
        Stack s=new Stack(size);
        System.out.println("1.Display\n2.Push\n3.Pop\n4.isEmpty\n5.isFull\n6.Peek\n7.Quit");
        while(true) {
            System.out.print("\nEnter case:");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    s.display();
                    break;

                case 2:
                    System.out.print("Enter value:");
                    int num=sc.nextInt();
                    s.push(num);
                    break;

                case 3:
                    s.pop();
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
