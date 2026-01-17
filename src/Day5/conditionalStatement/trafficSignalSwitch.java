package Day5.conditionalStatement;

// switch statement using String values
// Used for traffic signal control
//switch supports String in Java
//Case values must match exactly (case-sensitive)
//break is required to stop execution
//Best for fixed options like signals, menus

public class trafficSignalSwitch {
    public static void main(String[] args) {

        String color = "RED";

        switch (color) {

            case "RED":
                System.out.println("STOP");
                break;

            case "YELLOW":
                System.out.println("GET READY");
                break;

            case "GREEN":
                System.out.println("GO");
                break;

            default:
                System.out.println("Invalid traffic signal color");
        }
    }
}
