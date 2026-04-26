package tema5_ex1;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year = year;
    }
    public void displayInfo(){
        System.out.println("Marca masinii este :"+brand);
        System.out.println("Model masinii este :"+model);
        System.out.println("Anul de fabricatie al masinii este :"+year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Ford","Fiesta",1999);
        Car car2 = new Car("Dacia","Sandero",2025);
        car1.displayInfo();
        car2.displayInfo();

    }


}
