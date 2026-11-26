public abstract class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    public void turnON() {
        System.out.println("Power ON");
    }

    public void turnOFF() {
        System.out.println("Power OFF");
    }

    public abstract void operate();
}   