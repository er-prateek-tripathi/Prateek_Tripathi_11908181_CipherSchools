import java.util.Scanner;

public class ReverseArray {

    static void rvereseArray(int arr[],
                             int start, int end) {
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[],
                           int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.prinln("Enter the Length of the Desired Array: ");
        int n = sc.nextInt();
        System.out.println("length of array:" + n);
        int arr[] = new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rvereseArray(arr, arr[0], arr.length - 1);
        System.out.print("Reversed array is \n");
        printArray(arr, arr.length-1);

    }
}