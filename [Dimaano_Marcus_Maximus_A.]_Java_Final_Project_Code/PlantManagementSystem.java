import java.util.ArrayList;
import java.util.Scanner;

// Abstract Class (Abstraction)
abstract class Plant {
    private String name;
    private String type;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;

    // Constructor
    public Plant(String name, String type, String attribute1, String attribute2, String attribute3, String attribute4, String attribute5) {
        this.name = name;
        this.type = type;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.attribute5 = attribute5;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    // Abstract Method (Polymorphism)
    public abstract void describePlant();
}
//Inheritance
// Concrete Class for Plants
class GenericPlant extends Plant {
    public GenericPlant(String name, String type, String attribute1, String attribute2, String attribute3, String attribute4, String attribute5) {
        super(name, type, attribute1, attribute2, attribute3, attribute4, attribute5);
    }

    @Override
    public void describePlant() {
        System.out.println(getName() + " is a " + getType() + " with the following details:");
        System.out.println("1. Growing Season: " + getAttribute1());
        System.out.println("2. Status: " + getAttribute2());
        System.out.println("3. Amount: " + getAttribute3());
        System.out.println("4. Height: " + getAttribute4());
        System.out.println("5. Weight: " + getAttribute5());
    }
}

// Main Program
public class PlantManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Plant> plantList = new ArrayList<>();

    public static void main(String[] args) {
        displayTitleScreen();

        boolean running = true;
        while (running) {
            clearScreen();
            System.out.println("\n=== Plant Management System ===");
            System.out.println("1. Add a Plant");
            System.out.println("2. View All Plants");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1 -> addPlant();
                case 2 -> displayPlants();
                case 3 -> {
                    clearScreen();
                    System.out.println("Exiting the program. Goodbye!");
                    running = false;
                }
                default -> {
                    clearScreen();
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void displayTitleScreen() {
        clearScreen();
        System.out.println("########################################");
        System.out.println("#                                      #");
        System.out.println("#            SuperPlantMAKER           #");
        System.out.println("#      A Simple Plant Maker App        #");
        System.out.println("#                                      #");
        System.out.println("########################################");
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine(); // Wait for the user to press Enter
    }

    private static void addPlant() {
        clearScreen();
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│            Add a New Plant                  │");
        System.out.println("└─────────────────────────────────────────────┘\n");

        System.out.print("Enter the name of the plant: ");
        String name = scanner.nextLine();

        // Plant type selection
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│         Select the Type of Plant            │");
        System.out.println("├─────────────────────────────────────────────┤");
        System.out.println("│  1. Tree                                    │");
        System.out.println("│  2. Flowering Plant                         │");
        System.out.println("│  3. Vegetable                               │");
        System.out.println("└─────────────────────────────────────────────┘");
        System.out.print("Enter your choice (1-3): ");
        int typeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String type = switch (typeChoice) {
            case 1 -> "Tree";
            case 2 -> "Flowering Plant";
            case 3 -> "Vegetable";
            default -> "Unknown";
        };

        // Growing season selection
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│       Select the Growing Season             │");
        System.out.println("├─────────────────────────────────────────────┤");
        System.out.println("│               1. Spring                     │");
        System.out.println("│               2. Summer                     │");
        System.out.println("│               3. Fall                       │");
        System.out.println("│               4. Winter                     │");
        System.out.println("│               5. Year-Round                 │");
        System.out.println("└─────────────────────────────────────────────┘");
        System.out.print("Enter your choice (1-5): ");
        int seasonChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String attribute1 = switch (seasonChoice) {
            case 1 -> "Spring";
            case 2 -> "Summer";
            case 3 -> "Fall";
            case 4 -> "Winter";
            case 5 -> "Year-Round";
            default -> "Unknown";
        };

        // Status selection
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│        Select the Status of Plant           │");
        System.out.println("├─────────────────────────────────────────────┤");
        System.out.println("│  1. Selling                                 │");
        System.out.println("│  2. Trade                                   │");
        System.out.println("│  3. Sold                                    │");
        System.out.println("└─────────────────────────────────────────────┘");
        System.out.print("Enter your choice (1-3): ");
        int statusChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String attribute2 = switch (statusChoice) {
            case 1 -> "Selling";
            case 2 -> "Trade";
            case 3 -> "Sold";
            default -> "Unknown";
        };

        // Amount input
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│                 Amount                      │");
        System.out.println("└─────────────────────────────────────────────┘");
        System.out.print("Enter Amount: ");
        String attribute3 = scanner.nextLine();

        // Height input
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│                   Height                    │");
        System.out.println("└─────────────────────────────────────────────┘");
        System.out.print("Enter Height: ");
        String attribute4 = scanner.nextLine();

        // Weight input
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│                   Weight                    │");
        System.out.println("└─────────────────────────────────────────────┘");
        System.out.print("Enter Weight: ");
        String attribute5 = scanner.nextLine();

        // Add the plant to the list
        plantList.add(new GenericPlant(name, type, attribute1, attribute2, attribute3, attribute4, attribute5));
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│         Plant Added Successfully            │");
        System.out.println("└─────────────────────────────────────────────┘");

        System.out.println("\nPress Enter to return to the main menu...");
        scanner.nextLine();
        clearScreen();
    }

    private static void displayPlants() {
        clearScreen();
        if (plantList.isEmpty()) {
            System.out.println("No plants in the system.");
        } else {
            System.out.println("\n== All Plants in the System ==\n");
            for (Plant plant : plantList) {
                plant.describePlant();
                System.out.println("---------------------------");
            }
        }
        System.out.println("\nPress Enter to return to the main menu...");
        scanner.nextLine();
        clearScreen();
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception ex) {
            System.out.println("Error clearing the console: " + ex.getMessage());
        }
    }
}






        