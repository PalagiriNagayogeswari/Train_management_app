import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("======================================\n");

        // Input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Regex Patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validation
        boolean trainValid = trainMatcher.matches();
        boolean cargoValid = cargoMatcher.matches();

        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);

        System.out.println("\nUC11 validation completed...");

        sc.close();
    }
}