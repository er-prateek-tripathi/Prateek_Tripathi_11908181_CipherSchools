import java.util.*;

public class nameSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nameArr = new String[5];
        for(int i = 0; i<5; i++) {
            nameArr[i] = sc.nextLine();
        }
        System.out.println(" Names fed by the user: ");

        for (int i = 0; i<5; i++){
            System.out.println(nameArr[i] + "\n");
        }

        System.out.println("\n");

        String temp;

        Arrays.sort(nameArr);

        System.out.println("Alphabetically Sorted Array of names: ");

        for (int i = 0; i<5; i++){
            System.out.println(nameArr[i] + "\n");
        }


    }
}
