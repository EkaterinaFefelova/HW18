public class Dog extends Animal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Dog() {
    }

    public void move() {
        System.out.println("Собака по кличке " + super.getName() + " бежит по земле");
    }
}
