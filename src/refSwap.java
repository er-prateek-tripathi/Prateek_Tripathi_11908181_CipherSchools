import java.util.*;


public class refSwap {
    int a;
    int b;
    void change(refSwap swp){

        int temp = swp.a;
        swp.a = swp.b;
        swp.b = temp;
        String msg = String.format("The value after swap: a = %d, b = %d", swp.a, swp.b);

        System.out.println(msg);
    }

    void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public static void main(String[] args){

        refSwap swp = new refSwap();
        swp.get();
        swp.change(swp);

    }
}
