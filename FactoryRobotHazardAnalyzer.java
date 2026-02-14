import java.util.Scanner;

/**
 * Main entry point for the Factory Robot Hazard Analyzer system.
 * Handles only input and output.
 * Business logic delegated to RobotHazardAuditor.
 */
public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Arm Precision (0.0 - 1.0): ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density (1 - 20): ");
        int workerDensity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Machinery State (Worn/Faulty/Critical): ");
        String machineryState = scanner.nextLine();

        RobotHazardAuditor auditor = new RobotHazardAuditor();

        try {
            double risk = auditor.calculateHazardRisk(
                    armPrecision, workerDensity, machineryState);
            System.out.println("Robot Hazard Risk Score: " + risk);
        } catch (RobotSafetyException e) {
            // Exception message already printed
        }

        scanner.close();
    }
}
