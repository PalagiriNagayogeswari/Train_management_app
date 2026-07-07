import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("======================================\n");

        // Empty bogie list
        ArrayList<String> bogieIds = new ArrayList<>();

        // Check before searching
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search.");
        }

        // Search logic (will never execute because list is empty)
        String searchId = "BG309";

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                System.out.println("Bogie Found!");
                break;
            }
        }

        System.out.println("\nUC20 search completed...");
    }
}