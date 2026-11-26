public class Main {
    public static void main(String[] args) {
        Appliance a1 = new WashingMachine("LG");
        Appliance a2 = new Refrigerator("Panasonic");

        a1.displayBrand();
        a1.turnON();
        a1.operate();
        a1.turnOFF();

        System.out.println();

        a2.displayBrand();
        a2.turnON();
        a2.operate();
        a2.turnOFF();
    }
}