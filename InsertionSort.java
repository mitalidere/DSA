import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        System.out.print("Enter elements of array: ");
        int [] arr=new int [size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<size;i++) {
            int j=i;
            int temp=arr[j];
            while(j>0 && arr[j-1]>temp) {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        System.out.print("Sorted array: ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
