import java.util.*;
public class funcSortArray {
    static int n;
    // To print the arr
    public static void printarr(int[] arr)
    {
        // Iterating using for loops
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void sortarr(int[] arr)
    {
        int temp = 0;

        // Sort the arr 'arr' elements in ascending order
        // using nested for loops
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Displaying elements of arr after sorting
        System.out.println(
                "Elements of arr sorted in ascending order: ");
        printarr(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original arr : ");

        printarr(arr);

        sortarr(arr);

    }
}
