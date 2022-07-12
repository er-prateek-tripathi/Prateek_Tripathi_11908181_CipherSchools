import java.util.*;

public class introScanner {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
        System.out.println("Name : ");
        String User = sc.nextLine(); //string input
        System.out.println("Hello " + User);

        System.out.println("Enter your salary : ");
        int salary = sc.nextInt(); //Integer Input

        System.out.println("Salary is : " + salary);

        float height = sc.nextFloat(); //Float input


    }
}
