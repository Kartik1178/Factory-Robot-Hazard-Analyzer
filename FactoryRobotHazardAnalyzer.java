import java.util.Scanner;

/**
 * FactoryRobotHazardAnalyzer
 *
 * Entry point for the Factory Robot Hazard Analyzer system.
 * The application evolves incrementally across multiple use cases.
 *
 * UC1: Display static system message.
 * UC2: Accept robot hazard inputs and echo them.
 *
 * Author: Kartikeya
 */
public class FactoryRobotHazardAnalyzer {
    //Entry point of the Factory Robot Hazard Analyzer application.
    public static void main(String[] args) {

        // UC1: Static message
        System.out.println("Factory Robot Hazard Analyzer");

        // UC2: Accept inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter arm precision: ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter worker density: ");
        int workerDensity = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter machinery state: ");
        String machineryState = scanner.nextLine();

        // print inputs (no validation yet)
        System.out.println("\n--- Input Summary ---");
        System.out.println("Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);
        scanner.close();
    }
}
