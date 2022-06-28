import java.util.*;
public class sumFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastDigit = n%10;
        while(n>=10){
            n = n/10;
        }
        int firstDigit = n;
        int sum = firstDigit + lastDigit;
        String msg = String.format("Sum of First Digit: %d and Last Digit: %d is : %d", firstDigit, lastDigit, sum);
        System.out.println(msg);
    }
}
