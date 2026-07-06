// Custom Exception
class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Bogie Class
class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.name = name;
        this.capacity = capacity;
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("======================================\n");

        try {

            // Valid bogie
            Bogie bogie1 = new Bogie("Sleeper", 72);
            System.out.println("Created Bogie: " + bogie1.name + " -> " + bogie1.capacity);

            // Invalid bogie
            Bogie bogie2 = new Bogie("AC Chair", 0);

        } catch (InvalidCapacityException e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("\nUC14 exception handling completed...");
    }
}