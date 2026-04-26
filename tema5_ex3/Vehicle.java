package tema5_ex3;

class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Model: " + model);
    }
}
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}
class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Dacia", 2025, "Sandero");
        Vehicle motorcycle = new Motorcycle("Yamaha", 2024, true);

        car1.displayInfo();
        System.out.println();
        motorcycle.displayInfo();
    }
}
