public class trafficLight {
    public static void main(String[] args){
        String signalColors = "green";
        if(signalColors.equals("red")){
            System.out.println("Stop");
        }
        else if(signalColors.equals("green")){
            System.out.println("Go");
        }
        else if(signalColors.equals("yellow")){
            System.out.println("WAIT");
        }
        else {
            System.out.println("Invalid Sgnal Color");
        }
    }
}
