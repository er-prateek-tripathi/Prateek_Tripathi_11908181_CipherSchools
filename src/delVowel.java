import java.util.*;

public class delVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> al = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(userInput);

        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }


        System.out.println(sb.toString());

    }
}
