import java.util.*;
public class avg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int count = 1, total = 0;
        for(int i = 0; i<arr.length; i++){
            i = sc.nextInt();
            if(i<0){
                continue;
            }

            total += i;
            count +=1;
        }

        System.out.println("Average = " + total/count);

    }
}
