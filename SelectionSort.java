import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        System.out.print("Enter elements of array: ");
        int [] arr=new int [size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int min, temp;
        for(int i=0;i<size;i++) {
            min=i;
            for(int j=i+1;j<size;j++) {
                if(arr[min]>arr[j]) {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.print("Sorted array: ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}