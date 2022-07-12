public class arrangeNegatives {

    static void arrange(int arr[], int n) {
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0)
                temp[j++] = arr[i];
        }

        if (j == n || j == 0) return;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                temp[j++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        for (int x : arr) System.out.println(x);
    }


    public static void main(String[] args) {
        int arr1[] = {1,-1, 3, 2, -7, -5, 11, 6};
        int c = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                int temp = arr1[i];
                arr1[i] = arr1[c];
                arr1[c] = temp;
                c++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
    }
}
