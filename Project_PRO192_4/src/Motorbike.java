public class Motorbike {
    private String name;
    private String brand;
    private int engineCapacity;
    private double fuelCapacity;
    private String size;
    private String color;
    private double price;

    public Motorbike(String name, String brand, int engineCapacity, double fuelCapacity, String size, String color, double price) {
        this.name = name;
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.fuelCapacity = fuelCapacity;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public int getEngineCapacity() { return engineCapacity; }
    public double getFuelCapacity() { return fuelCapacity; }
    public String getSize() { return size; }
    public String getColor() { return color; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("%-12s | %-8s | %4dcc | %.1fL | %-10s | %-8s | %,10.0f VND",
                name, brand, engineCapacity, fuelCapacity, size, color, price);
    }
}
