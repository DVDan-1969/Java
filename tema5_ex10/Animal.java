package tema5_ex10;

abstract class Animal {
    protected String name;

       public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    // metodă normală
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        Cat c = new Cat("Mimi");
        // Polimorfism
        Animal a1 = d;
        Animal a2 = c;
        a1.makeSound();
        a1.sleep();
        a2.makeSound();
        a2.sleep();
    }
}
