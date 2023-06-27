import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        System.out.print("Enter elements of array: ");
        int [] arr=new int [size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element that you want to search: ");
        int element=sc.nextInt();
        int flag=0;
        for(int i=0;i<size;i++) {
            if(arr[i]==element) {
                System.out.print("Element found");
                flag=1;
                break;
            }
        }
        if(flag==0) {
            System.out.print("Element not found");
        }
    }
}
