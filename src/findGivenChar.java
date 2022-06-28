import java.util.*;
public class findGivenChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String usrInput = sc.nextLine();

        System.out.println("Enter the Character : ");
        char findChar = sc.next().charAt(0);

        int cnt = 0;

        for(int i = 0; i<usrInput.length(); i++) {
            if(usrInput.charAt(i) == findChar) cnt++;
        }

        String msg = String.format("The number of occurrences of Character %s in the given string: %s is %d.",findChar,usrInput,cnt);

        System.out.println(msg);
    }
}
