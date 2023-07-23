import java.util.Scanner;

class SinglyLinkedList {
    Scanner sc=new Scanner(System.in);
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data=d;
            next=null;
        }
    }

    void display()
    {
        Node temp=head;
        if(temp==null) {
            System.out.print("EMPTY");
        }
        else {
            while(temp!=null)
            {
                System.out.println(temp.data+"|"+temp.next);
                temp=temp.next;
            }
        }
    }
    void insertAtBeginning(int num) {
        if(head==null) {
            head=new Node(num);
        }
        else {
            Node temp = head;
            head = new Node(num);
            head.next = temp;
        }

    }
    void insertAtEnd(int num) {
        if(head==null) {
            head=new Node(num);
        }
        else {
            Node temp=head;
            while(temp!=null) {
                if (temp.next == null) {
                    temp.next = new Node(num);
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void insertAtPosition(int position,int num) {
        if(position==1) {
            Node var=head;
            head=new Node(num);
            head.next=var;
        }
        else {
            Node temp=head;
            int p=1;
            while(temp!=null) {
                if (p+1 == position) {
                    Node var=temp.next;
                    temp.next=new Node(num);
                    temp.next.next=var;
                }
                p++;
                temp=temp.next;
            }
        }
    }
    void deleteFirstNode() {
        if(head!=null) {
            head = head.next;
        }
    }
    void deleteFromEnd() {
        Node temp=head;
        while(temp!=null) {
            if(temp.next==null) {
                head=null;
                break;
            }
            else if(temp.next.next==null) {
                temp.next=null;
            }
            temp=temp.next;
        }
    }
    void deletionOfOnlyNode(int position) {
        if(position==1)
        {
            head=head.next;
        }
        else {
            Node temp=head;
            int p=1;
            while(temp!=null) {
                if (p + 1 == position) {
                    temp.next = temp.next.next;
                    System.out.println(temp.next);
                }
                p++;
                temp = temp.next;
            }
        }
    }
    void deletionOfEvenNodes() {
        Node temp=head;
        while(temp!=null) {
            if(head.data%2==0) {
                if(head.next!=null) {
                    head = head.next;
                }
                else {
                    head=null;
                    break;
                }
            }
            else if(temp.next==null) {
                break;
            }
            else if(temp.next.data%2==0) {
                temp.next=temp.next.next;
                if(temp.next==null) {
                    break;
                }
            }
            temp=temp.next;
        }
    }
    void deletionOfOddNodes() {
        Node temp=head;
        while(temp!=null) {
            if(head.data%2!=0) {
                if(head.next!=null) {
                    head = head.next;
                }
                else {
                    head=null;
                    break;
                }
            }
            else if(temp.next==null) {
                break;
            }
            else if(temp.next.data%2!=0) {
                temp.next=temp.next.next;
                if(temp.next==null) {
                    break;
                }
            }
            temp=temp.next;
        }
    }
    void count()
    {
        Node temp=head;
        int count=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        System.out.println("Total no. of nodes are "+count);
    }
    void lastNode() {
        Node temp=head;
        while(temp!=null) {
            if(temp.next==null) {
                System.out.println("Last node of linked list is "+temp.data);
            }
            temp=temp.next;
        }
    }
    void search()
    {
        Node temp=head;
        System.out.print("Enter node you want to search:");
        int node=sc.nextInt();
        int flag=0;
        int position=1;
        while(temp!=null) {
            if(temp.data==node)
            {
                flag=1;
                System.out.println("Node found at address "+temp+" at position "+position);
            }
            temp=temp.next;
            position++;
        }
        if(flag==0) {
            System.out.println("Node not found");
        }
    }
    void predecessor() {
        Node temp=head;
        System.out.print("Enter node of which you want to find the predecessor:");
        int pre=sc.nextInt();
        int flag=0;
        if(temp.data==pre)
        {
            System.out.println("No predecessor");
            flag=1;
        }
        while(temp.next!=null)
        {
            if(temp.next.data==pre)
            {
                flag=1;
                System.out.println("Predecessor of "+temp.next.data+" is "+temp.data+" with address "+temp);
            }
            temp=temp.next;
        }
        if(flag==0) {
            System.out.println("Node not found");
        }
    }
    void nodeUsingPosition() {
        System.out.print("Enter position:");
        int p=sc.nextInt();
        Node temp=head;
        int position=1;
        int flag=0;
        while(temp!=null) {
            if(position==p) {
                System.out.println("Node at position "+p+" is "+temp.data+" at address "+temp);
                flag=1;
                break;
            }
            position++;
            temp=temp.next;
        }
        if(flag==0) {
            System.out.print("Enter correct position");
        }
    }
    void middle() {
        Node temp=head;
        int count=0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = (int) Math.ceil(count / 2f);
        temp = head;
            int position = 0;
            while (temp != null) {
                position++;
                if (position == mid) {
                    if(count%2!=0) {
                        System.out.println(temp.data);
                    }
                    else {
                        System.out.println(temp.data+" "+temp.next.data);
                    }
                }
                temp = temp.next;
            }
    }
    void addTwoNodes(int p) {
        int position = 0;
        Node temp = head;
        if (head.next == null) {
            System.out.println("Cannot add");
        } else if (head.next.next == null) {
            Node n = new Node(head.data + head.next.data);
            head = n;

        } else {
            while (temp != null) {
                position++;
                if (position == p) {
                    temp.data += temp.next.data;
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SinglyLinkedList l=new SinglyLinkedList();
        System.out.println("1.Display\n2.Insert node at beginning\n3.Insert node at end\n4.Insert node at position\n5.Delete first node\n6.Delete last node\n7.Delete node using position\n8.Deletion of even nodes\n9.Deletion of odd nodes\n10.Middle node of linked list\n11.Total number of nodes\n12.Last node\n13.Search a particular node using value\n14.Predecessor of node using value\n15.Search node using position\n16.Adding two nodes\n17.Exit");


        while(true) {
            System.out.print("\n\nEnter case:");
            int input=sc.nextInt();
            switch (input) {
                case 1:
                    l.display();
                    break;

                case 2:
                    System.out.print("Enter value of node:");
                    int n2 = sc.nextInt();
                    l.insertAtBeginning(n2);
                    break;

                case 3:
                    System.out.print("Enter value of node:");
                    int n1 = sc.nextInt();
                    l.insertAtEnd(n1);
                    break;

                case 4:
                    System.out.print("Enter value of node:");
                    int num=sc.nextInt();
                    System.out.print("Enter position at which you want to insert the node:");
                    int position=sc.nextInt();
                    l.insertAtPosition(position,num);
                    break;

                case 5:
                    l.deleteFirstNode();
                    break;

                case 6:
                    l.deleteFromEnd();
                    break;

                case 7:
                    System.out.print("Enter position of Node to be deleted:");
                    position=sc.nextInt();
                    l.deletionOfOnlyNode(position);
                    break;

                case 8:
                    l.deletionOfEvenNodes();
                    break;

                case 9:
                    l.deletionOfOddNodes();
                    break;

                case 10:
                    l.middle();
                    break;

                case 11:
                    l.count();
                    break;

                case 12:
                    l.lastNode();
                    break;

                case 13:
                    l.search();
                    break;

                case 14:
                    l.predecessor();
                    break;

                case 15:
                    l.nodeUsingPosition();
                    break;

                case 16:
                    System.out.print("Enter position:");
                    int p=sc.nextInt();
                    l.addTwoNodes(p);
                    break;

                case 17:
                    System.exit(0);

                default:
                    System.out.print("Enter valid choice");
            }
        }
    }
}