package tema5_ex4;

import java.time.Year; // pentru a obține anul curent

// Clasa de bază
class Vehicle {
    // câmpuri private → încapsulare (nu pot fi accesate direct din exterior)
    private String brand;
    private int year;

    // constructor → inițializează obiectul folosind setterele (nu acces direct)
    public Vehicle(String brand, int year) {
        setBrand(brand); // validare inclusă
        setYear(year);   // validare inclusă
    }

    // getter → oferă acces controlat la brand
    public String getBrand() {
        return brand;
    }

    // getter → oferă acces controlat la year
    public int getYear() {
        return year;
    }

    // setter cu validare pentru brand
    public boolean setBrand(String brand) {
        // verifică dacă e null sau gol
        if (brand == null || brand.trim().isEmpty()) {
            System.out.println("Brand invalid!");
            return false; // nu modifică valoarea
        }
        this.brand = brand; // setează doar dacă e valid
        return true;
    }

    // setter cu validare pentru year
    public boolean setYear(int year) {
        int currentYear = Year.now().getValue(); // anul curent

        // verifică intervalul valid
        if (year < 1886 || year > currentYear) {
            System.out.println("An invalid! Trebuie între 1886 și " + currentYear);
            return false; // nu modifică valoarea
        }

        this.year = year; // setează valoarea validă
        return true;
    }

    // metodă de afișare → folosește getters (nu acces direct)
    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
    }
}

class Car extends Vehicle {
    private String model; // câmp privat

    public Car(String brand, int year, String model) {
        super(brand, year); // apelează constructorul clasei de bază
        setModel(model);    // validare pentru model
    }

    public String getModel() {
        return model;
    }

    public boolean setModel(String model) {
        // validare similară cu brand
        if (model == null || model.trim().isEmpty()) {
            System.out.println("Model invalid!");
            return false;
        }
        this.model = model;
        return true;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // afișează brand + year
        System.out.println("Model: " + getModel());
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar; // câmp privat

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        setHasSidecar(hasSidecar);
    }

    // getter pentru boolean (convenție: începe cu "is")
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    // setter simplu (nu necesită validare complexă)
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Are sidecar: " + isHasSidecar());
    }
}


class Main {
    public static void main(String[] args) {
        // obiect valid
        Car car = new Car("Toyota", 2020, "Corolla");
        car.displayInfo();

        System.out.println();

        // test valori invalide (fără try-catch)
        if (!car.setYear(3000)) {
            System.out.println("Nu s-a putut seta anul!");
        }

        if (!car.setBrand("")) {
            System.out.println("Nu s-a putut seta brandul!");
        }

        System.out.println();

        // alt obiect
        Motorcycle moto = new Motorcycle("Harley", 2015, true);
        moto.displayInfo();
    }
}