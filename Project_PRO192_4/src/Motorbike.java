public class Motorbike {
    private String name;
    private String brand;
    private int engineCapacity; 
    private double fuelTank;   
    private String size;        
    private String color;

    public Motorbike(String name, String brand, int engineCapacity, double fuelTank, String size, String color) {
        this.name = name;
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.fuelTank = fuelTank;
        this.size = size;
        this.color = color;
    }

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public int getEngineCapacity() { return engineCapacity; }
    public double getFuelTank() { return fuelTank; }
    public String getSize() { return size; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return String.format("%-12s | %-8s | %4dcc | %.1fL | %-10s | %-8s",
                name, brand, engineCapacity, fuelTank, size, color);
    }
}

