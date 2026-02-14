import java.util.Scanner;

/**
 * FactoryRobotHazardAnalyzer
 *
 * UC1: Display static system message.
 * UC2: Accept robot hazard inputs.
 * UC3: Calculate hazard risk score.
 * UC4: Validation using conditional logic.
 * UC5: Refactor validation into separate method.
 * UC6: Introduce custom exception for invalid scenarios.
 *
 * Author: Kartikeya
 */
public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter arm precision (0.0 - 1.0): ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter worker density (1 - 20): ");
        int workerDensity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter machinery state (Worn/Faulty/Critical): ");
        String machineryState = scanner.nextLine();

        try {
            double riskScore = calculateHazardRisk(armPrecision, workerDensity, machineryState);
            System.out.println("Hazard Risk Score: " + riskScore);
        } catch (RobotSafetyException e) {
            // Exception already prints the message
        }

        scanner.close();
    }

    /**
     * Validates inputs and calculates hazard risk score.
     * Throws RobotSafetyException if validation fails.
     */
    public static double calculateHazardRisk(double armPrecision,
                                             int workerDensity,
                                             String machineryState)
            throws RobotSafetyException {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
        }

        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException("Error: Worker density must be 1-20");
        }

        if (!machineryState.equals("Worn") &&
                !machineryState.equals("Faulty") &&
                !machineryState.equals("Critical")) {
            throw new RobotSafetyException("Error: Unsupported machinery state");
        }

        // UC3 logic reused (final formula comes in later UC)
        return armPrecision * workerDensity;
    }
}
