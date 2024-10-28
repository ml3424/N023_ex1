public class Clothing extends Product{
    private String brand;

    public Clothing(String name, double price, String description, String brand) {
        super(name, price, description);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void getDescriptionNow() {
        System.out.println(super.getDescription() + "the cloth is very good");
    }
}
