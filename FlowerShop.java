import java.util.Scanner;

public class FlowerShop {
    private Flower[] inventory;

    public FlowerShop() {
        inventory = new Flower[10]; // Creating an array of Flower objects with size 10
    }

    public void addFlowers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Enter details for flower #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Colour: ");
            String colour = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            inventory[i] = new Flower(name, colour, price, quantity);
        }
    }

    public void displayInventory() {
        System.out.println("Flower Inventory:");
        for (Flower flower : inventory) {
            System.out.println(flower);
        }
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (Flower flower : inventory) {
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        return totalValue;
    }

    public void searchFlower(String name) {
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(name)) {
                System.out.println("Flower found:");
                System.out.println(flower);
                return;
            }
        }
        System.out.println("Flower not found.");
    }

    public void restockFlower(String name, int quantity) {
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(name)) {
                flower.setQuantity(flower.getQuantity() + quantity);
                System.out.println("Restocked " + quantity + " " + name + "(s) successfully.");
                return;
            }
        }
        System.out.println("Flower not found for restocking.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlowerShop flowerShop = new FlowerShop();

        flowerShop.addFlowers();
        flowerShop.displayInventory();

        System.out.println("Total value of the inventory: $" + flowerShop.calculateTotalValue());

        System.out.print("Enter the name of the flower to search: ");
        String searchName = scanner.nextLine();
        flowerShop.searchFlower(searchName);

        System.out.print("Enter the name of the flower to restock: ");
        String restockName = scanner.nextLine();
        System.out.print("Enter the quantity to restock: ");
        int restockQuantity = scanner.nextInt();
        flowerShop.restockFlower(restockName, restockQuantity);

        scanner.close();
    }
}