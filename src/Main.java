public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog ("Гроза Морей", 5, 15);
        Duck duck = new Duck("Северный Ветер", 2, 2.5);
        dog.walk();
        dog.move();
        duck.walk();
        duck.move();
    }
}
