public class Helloworld {
    public static void main(String[] args){
        System.out.println("Hello");
        String name = "Susan";
        int age = 55;
        float height = 5.10f;
        boolean isIndian = false;
        String msg1 = String.format("Hi! %s you are %d yrs old\n", name, age);

        System.out.println(msg1);
        //System.out.println("Hi! "+name+" you are "+age+" yrs old\n");

        String planet = "Earth";
        int diameter = 12734;
        String msg = String.format("The Diameter of %s is  %d", planet, diameter);

        System.out.println(msg);
    }
}
