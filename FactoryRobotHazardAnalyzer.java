import java.util.Scanner;

/**
 * FactoryRobotHazardAnalyzer
 *
 * UC1: Display static system message.
 * UC2: Accept robot hazard inputs.
 * UC3: Calculate hazard risk score (no validation).
 * UC4: Introduce validation using conditional logic.
 *
 * Author: Kartikeya
 */
public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // UC1
        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        // UC2 inputs
        System.out.print("Enter arm precision (0.0 - 1.0): ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter worker density (1 - 20): ");
        int workerDensity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter machinery state (Worn/Faulty/Critical): ");
        String machineryState = scanner.nextLine();

        // UC4: Validation using conditional logic
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.println("Error: Arm precision must be 0.0-1.0");
        } else if (workerDensity < 1 || workerDensity > 20) {
            System.out.println("Error: Worker density must be 1-20");
        } else if (!machineryState.equals("Worn") &&
                !machineryState.equals("Faulty") &&
                !machineryState.equals("Critical")) {
            System.out.println("Error: Unsupported machinery state");
        } else {
            // UC3 logic reused
            double riskScore = calculateRiskScore(armPrecision, workerDensity);
            System.out.println("Hazard Risk Score: " + riskScore);
        }

        scanner.close();
    }

    // UC3 business logic
    public static double calculateRiskScore(double armPrecision, int workerDensity) {
        return armPrecision * workerDensity;
    }
}
