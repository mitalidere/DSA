import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        System.out.print("Enter elements of array: ");
        int [] arr=new int [size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i=0;i<size;i++) {
            for(int j=0;j<size-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
