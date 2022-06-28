import java.util.*;
public class maxMinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("\nMaximum Element : " + arr[n-1]);
        System.out.println("\nMinimum Element : " + arr[0]);
    }
}
