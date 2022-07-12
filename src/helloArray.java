public class helloArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        System.out.println("Element at index 2 is " + arr[2]);
        System.out.println("Total elements present in the array are: " + arr.length);

        for(int index = 0; index<arr.length; index++) {
            System.out.println(arr[index]);
        }

        for(int value : arr){
            System.out.println(value);
        }

        int arr1[][] = {{10,20,30}, {40,50,60}, {70,80,90}};

        for(int i = 0; i<arr1.length; i++){
            System.out.println(arr1.[i]);
        }
    }
}
