public class loops {
    public static void main(String[] args) {
        for ( int i = 0; i<10 ; i++){
            System.out.println("Counting 1 to 10 : " + i);
        }

        for(int inch = 1;inch<=5; inch++){
            for(int cm = 1; cm<=inch; cm++){
                System.out.println("*");
            }
            System.out.println();
        }

    }
}
