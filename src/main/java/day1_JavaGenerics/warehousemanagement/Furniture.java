package day1_JavaGenerics.warehousemanagement;

public class Furniture extends WarehouseItem{
    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nMaterial : " + getMaterial();
    }
}
