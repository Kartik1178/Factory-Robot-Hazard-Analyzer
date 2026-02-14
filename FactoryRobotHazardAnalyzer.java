import java.util.Scanner;

/**
 * FactoryRobotHazardAnalyzer
 *
 * Entry point for the Factory Robot Hazard Analyzer system.
 * The application evolves incrementally across multiple use cases.
 *
 * UC1: Display static system message.
 * UC2: Accept robot hazard inputs and echo them.
 * UC3: Calculate and display hazard risk score (no validation).
 *
 * Author: Kartikeya
 */
public class FactoryRobotHazardAnalyzer {

    /**
     * Entry point of the application.
     * UC1: Displays system message.
     * UC2: Accepts hazard-related inputs.
     * UC3: Calculates and prints hazard risk score.
     */
    public static void main(String[] args) {

        // UC1: Static message
        System.out.println("Factory Robot Hazard Analyzer");

        // UC2: Accept inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter arm precision: ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter worker density: ");
        int workerDensity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter machinery state: ");
        String machineryState = scanner.nextLine();

        // UC3: Calculate hazard risk score
        double riskScore = calculateRiskScore(armPrecision, workerDensity);

        // Display risk score
        System.out.println("\nHazard Risk Score: " + riskScore);

        scanner.close();
    }

    /**
     * Calculates hazard risk score based on arm precision and worker density.
     * Assumes inputs are valid (no validation as per UC3 requirement).
     *
     * @param armPrecision  precision of robotic arm
     * @param workerDensity number of workers near robot
     * @return calculated hazard risk score
     */
    public static double calculateRiskScore(double armPrecision, int workerDensity) {
        return armPrecision * workerDensity;
    }
}
