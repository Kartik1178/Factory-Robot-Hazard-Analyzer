/**
 * Custom exception for robot safety validation failures.
 * The exception itself prints the error message.
 */
public class RobotSafetyException extends Exception {

    public RobotSafetyException(String message) {
        super(message);
        System.out.println(message);
    }
}
