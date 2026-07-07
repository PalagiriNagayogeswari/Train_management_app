public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("======================================\n");

        // Array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Search key
        String searchId = "BG309";

        // Display available IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Linear Search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " not found in train consist.");
        }

        System.out.println("\nUC18 search completed...");
    }
}