public class Duck extends Animal{
    public Duck(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Duck() {
    }

    @Override
    public void move() {
        System.out.println("Утка по кличке " + super.getName() + " летит в облаках");
    }
}
