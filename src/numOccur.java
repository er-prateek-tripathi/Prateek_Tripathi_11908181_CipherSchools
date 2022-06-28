import java.util.*;
import java.util.stream.Collectors;

public class numOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usrInput = sc.nextLine();

        String result = Arrays.asList(usrInput.split(" "))
                .stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));

        System.out.println("Reversed String : " + result);
    }
}
