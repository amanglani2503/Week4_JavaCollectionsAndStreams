package day1_JavaGenerics.onlinemarketplace;

public class Product <T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "Name : '" + name +
                "\nPrice : " + price +
                "\nCategory : " + category;
    }
}
