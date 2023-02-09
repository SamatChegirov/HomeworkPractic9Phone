public class Phone {
    private String brand;
    private String version;
    private double screen;
    private int memory;
    private int price;


    public Phone(String brand, String version, double screen) {
        this.brand = brand;
        this.version = version;
        this.screen = screen;
    }
    public Phone(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
