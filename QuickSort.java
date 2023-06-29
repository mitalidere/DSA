import java.util.Scanner;

public class QuickSort {
    int partition(int [] arr, int left, int right) {
        int i=left, j=right, temp;
        int pivot=arr[(left+right)/2];
        while(i<=j) {
            while(arr[i]<pivot) {
                i++;
            }
            while(arr[j]>pivot) {
                j--;
            }
            if(i<=j) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return i;
    }
    void recursion(int [] arr, int left, int right) {
        int index=partition(arr, left, right);
        if(left<index-1) {
            recursion(arr, left, index-1);
        }
        if(index<right) {
            recursion(arr, index, right);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        System.out.print("Enter elements of array: ");
        int [] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        QuickSort qs=new QuickSort();
        qs.recursion(arr, 0, size-1);
        System.out.print("Sorted array: ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}