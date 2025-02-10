package day1_JavaGenerics.warehousemanagement;

public class Main {
    public static void main(String[] args) {
        // creating storage for electronic Items
        Storage<Electronics> electronicsStorage = new Storage<>();

        // storing electronic items
        electronicsStorage.addItem(new Electronics("Mobile", 15000, "Oppo"));
        electronicsStorage.addItem(new Electronics("Laptop", 65000, "Dell"));

        // creating storage for grocery Items
        Storage<Groceries> groceryStorage = new Storage<>();
        // storing grocery items
        groceryStorage.addItem(new Groceries("Rice", 30, "25-02-2025"));
        groceryStorage.addItem(new Groceries("Flour", 33, "28-02-2025"));

        // creating storage for furniture Items
        Storage<Furniture> furnitureStorage = new Storage<>();
        // storing furniture items
        furnitureStorage.addItem(new Furniture("Chair", 500, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 500, "Metal"));

        // displaying electronic items
        System.out.println("Displaying Electronic Items :-");
        electronicsStorage.displayList(electronicsStorage.getItems());

        // displaying Grocery items
        System.out.println("\nDisplaying Grocery Items :-");
        electronicsStorage.displayList(groceryStorage.getItems());

        // displaying Furniture items
        System.out.println("\nDisplaying Furniture Items :-");
        electronicsStorage.displayList(furnitureStorage.getItems());

    }
}
