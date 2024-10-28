public class Electronics extends Product{
    int volt;

    public Electronics(String name, double price, String description, int volt) {
        super(name, price, description);
        this.volt = volt;
    }

    public int getVolt() {
        return volt;
    }
    public void setVolt(int volt) {
        this.volt = volt;
    }

    @Override
    public void getDescriptionNow() {
        System.out.println(super.getDescription() + "it os an electronics device");
    }
}
