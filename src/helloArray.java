public class helloArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        System.out.println("Element at index 2 is " + arr[2]);
        System.out.println("Total elements present in the array are: " + arr.length);

        for(int index = 0; index<arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}
