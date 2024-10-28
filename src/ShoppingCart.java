public class ShoppingCart {
    Product[] cart;

    public ShoppingCart() {
        this.cart = new Product[10];
    }

    public double calculateTotal()
    {
        double sum_cart = 0;
        for(Product p:this.cart)
        {
            sum_cart += p.getPrice();
        }
        return sum_cart;
    }
}
