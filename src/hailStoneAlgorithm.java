import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class hailStoneAlgorithm {
    /* Hailstone Sequence Algorithm
    Take a number (say n) as input
    while n!= 1
    a. print the value of n.
    b. if n is odd, calculate the next number as n*3+1.
    c. if n is even, calculate the next number as n/2.

    input = 10;
    Output ( Via HailStone Algorithm) = 10->5->16->8->4->2->1

    input  = 17;
    Output (via HailStone Algorithm) = 17->51->26->13->40->20->10->5->16->8->4->2->1

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");

        int n = sc.nextInt();

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(" -> " + n);
            } else {
                n = (n * 3) + 1;
                System.out.println(" -> " + n);
            }
        }

    }
}
