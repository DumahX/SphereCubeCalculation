import javax.swing.JOptionPane;

public class Main {
    private static final String PROGRAM_TITLE = "Sphere and Cube Calculation";

    public static void main(String[] args) {
        doSphereCalculation();
        doCubeCalculation();
    }

    private static void doSphereCalculation() {
        double radius = convertToDouble(getUserInput("Enter the radius of a sphere:"));
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        displaySurfaceArea(surfaceArea);
        displayVolume(volume);
    }

    private static void doCubeCalculation() {
        double edgeLength = convertToDouble(getUserInput("Enter the edge length of a cube:"));
        double surfaceArea = 6.0 * Math.pow(edgeLength, 2);
        double volume = Math.pow(edgeLength, 3);

        displaySurfaceArea(surfaceArea);
        displayVolume(volume);
    }

    private static double convertToDouble(String numberString) {
        try {
            return Double.parseDouble(numberString);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static String getUserInput(String inputMessage) {
        String collectedInput = JOptionPane.showInputDialog(null, inputMessage, PROGRAM_TITLE, JOptionPane.INFORMATION_MESSAGE);

        return collectedInput != null ? collectedInput : "";
    }

    private static void displayMessage(String messageToDisplay) {
        JOptionPane.showMessageDialog(null, messageToDisplay, PROGRAM_TITLE, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void displaySurfaceArea(double surfaceArea) {
        displayMessage(String.format("The surface area is: %.2f", surfaceArea));
    }

    private static void displayVolume(double volume) {
        displayMessage(String.format("The volume is: %.2f", volume));
    }
}