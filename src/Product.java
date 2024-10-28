public class Product {
    private String name;
    private double price;
    private String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription() {
        return "Description: " + description;
    }

    @Override // ask whyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public void getDescriptionNow() {
        System.out.println(description);
    }
}
