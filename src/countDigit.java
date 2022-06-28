import java.util.*;
public class countDigit {


    // Function to count digits
    static void countEvenOddZero(int n) {
        int even_count = 0;
        int odd_count = 0;
        int zero_count = 0;
        while (n > 0) {
            int rem = n % 10;
            if(rem == 0) zero_count++;
            else if (rem % 2 == 0)
                even_count++;
            else
                odd_count++;
            n = n / 10;
        }
        System.out.println("Even count : " + even_count);
        System.out.println("Odd count : " + odd_count);
        System.out.println("Zero count : " + zero_count);
    }

    // Driver Code
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        countEvenOddZero(n);


    }
}

