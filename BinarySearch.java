import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        System.out.print("Enter elements of array: ");
        int [] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the element that you want to search: ");
        int element=sc.nextInt();
        Arrays.sort(arr);
        int mid, first=0, last=size-1;
        int flag=0;
        while(true) {
            mid=(first+last)/2;
            if(arr[mid]==element) {
                System.out.print("Element found");
                flag=1;
                break;
            }
            else if(arr[mid]<element) {
                first=mid+1;
            }
            else {
                last=mid-1;
            }
            if(first>last) {
                break;
            }
        }
        if(flag==0) {
            System.out.print("Element not found");
        }
    }
}
