package tema6_ex2;

interface Discountable {
    double applyDiscount(double percent);
}
class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // method overloading
    public void displayInfo() {
        System.out.println("Name: " + name);
    }

    public void displayInfo(boolean showPrice) {
        if (showPrice) {
            System.out.println("Name: " + name + ", Price: " + price);
        } else {
            displayInfo();
        }
    }
}
class Pizza extends FoodItem implements Discountable {
    private int size; // ex: 30 cm

    public Pizza(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }

    // preț diferit în funcție de mărime
    public double calculatePrice() {
        return getPrice() + size * 0.5;
    }

    @Override
    public double applyDiscount(double percent) {
        return calculatePrice() * (1 - percent / 100);
    }
}
class Burger extends FoodItem {
    private boolean extraCheese;

    public Burger(String name, double price, boolean extraCheese) {
        super(name, price);
        this.extraCheese = extraCheese;
    }

    public double calculatePrice() {
        if (extraCheese) {
            return getPrice() + 2;
        }
        return getPrice();
    }
}
class Main {
    public static void main(String[] args) {
        Pizza p = new Pizza("Margherita", 20, 30);
        Burger b = new Burger("Cheeseburger", 15, true);

        p.displayInfo(true);
        System.out.println("Pizza price: " + p.calculatePrice());
        System.out.println("Discounted: " + p.applyDiscount(10));

        b.displayInfo(true);
        System.out.println("Burger price: " + b.calculatePrice());
    }
}