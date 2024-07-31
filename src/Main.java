public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog ("Гроза Морей", 5, 15);
        Animal duck = new Duck("Северный Ветер", 2, 2.5);
        dog.walk();
        dog.move();
        duck.walk();
        duck.move();
    }
}
