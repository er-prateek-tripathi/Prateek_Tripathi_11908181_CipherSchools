import java.util.Arrays;

public class introString {
    public static void main (String[] args) {
        String msg = "Live life to fullest";
        // Accessing a particular character
        System.out.println(msg.charAt(2));

        //converting a string into char array
        char[] characters = msg.toCharArray();
        System.out.println(Arrays.toString(characters));

        characters[1] = 'o';
        String nstr = new String(characters);

        System.out.println(nstr);

        // Concatenating String

        String s1 = "Iron";
        String s2 = "Monger";
        String s3 = s1.concat(s2);
        System.out.println(s3);

        // finding index of given

        System.out.println("In String " + s3 + " The letter m is at index " + s3.indexOf('M'));

        //comparing strings

        String test1 = "Prateek";
        String test2 = "Pratik";

        System.out.println(test1.compareTo(test2));

        System.out.println(test1.compareToIgnoreCase(test2));

        // checking if the given string contains the given substring

        String secret = "The diamond is here.";

        System.out.println("Scanning Diamond and found "+ secret.contains("diamond"));

        //Splitting String

        String ice_cream = "chocolate-Vanila-Strawberry-Rum Raisin-Black Current";

        String[] flavours = ice_cream.split("-");

        System.out.println(Arrays.toString(flavours));

        for(String fl : flavours){
            System.out.println(fl);
        }
    }
}
