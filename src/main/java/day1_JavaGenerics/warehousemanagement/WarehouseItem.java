package day1_JavaGenerics.warehousemanagement;

public class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name : " + getName() + "\nPrice : $" + getPrice();
    }
}
