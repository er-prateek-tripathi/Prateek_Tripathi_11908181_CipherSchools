import java.util.Scanner;

public class ReverseArray {

    static void reverseArray(int[] arr,
                             int n) {
        int temp;

        for(int i = 0; i<n/2; i++) {
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");

            System.out.println();

    }

//    static void printArray(int arr[],
//                           int size) {
//        for (int i = 0; i < size; i++)
//            System.out.print(arr[i] + " ");
//
//        System.out.println();
//    }

    // Driver code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.println("length of array:" + n);

        System.out.println("Enter the array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Reversed array is \n");
        reverseArray(arr,arr.length);

    }
}