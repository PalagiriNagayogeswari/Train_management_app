import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("======================================\n");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // Invalid

        // Display goods bogies
        System.out.println("Goods Bogies in Train:");
        for (GoodsBogie b : goodsBogies) {
            System.out.println(b.type + " -> " + b.cargo);
        }

        // Safety validation
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> !b.type.equals("Cylindrical")
                        || b.cargo.equals("Petroleum"));

        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}