import java.util.Scanner;

/**
 * UC1: Display static system message
 * UC2: Accept inputs
 * UC3: Calculate simple risk
 * UC4: Validation with if-else
 * UC5: Refactor into method
 * UC6: Custom exception handling
 * UC7: Machinery state risk mapping
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
            // message already printed by exception
        }

        scanner.close();
    }

    public static double calculateHazardRisk(double armPrecision,
                                             int workerDensity,
                                             String machineryState)
            throws RobotSafetyException {

        // Validation
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
        }

        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException("Error: Worker density must be 1-20");
        }

        // UC7: Machinery state risk mapping
        double machineRiskFactor;

        if (machineryState.equals("Worn")) {
            machineRiskFactor = 1.3;
        } else if (machineryState.equals("Faulty")) {
            machineRiskFactor = 2.0;
        } else if (machineryState.equals("Critical")) {
            machineRiskFactor = 3.0;
        } else {
            throw new RobotSafetyException("Error: Unsupported machinery state");
        }

        // Updated hazard formula using mapped factor
        return armPrecision * workerDensity * machineRiskFactor;
    }
}
