package day1_JavaGenerics.warehousemanagement;

public class Groceries extends WarehouseItem{
    private String expiryDate;

    public Groceries(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nExpiry Date : " + getExpiryDate();
    }
}
