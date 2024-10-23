public class App {

    public static void main(String[] args) {
        Dog snoopy = new Dog();
        Dog scooby = new Dog("Scooby-Doo", "Great Dane", 7);
        Cat Tina = new Cat();
        Cat Tom = new Cat("Tom", "Grey", 6);
        snoopy.displayAnimalInfo();
        scooby.displayAnimalInfo();
        Tina.displayAnimalInfo();
        Tom.displayAnimalInfo();
        Dog.displaySpecies();
        Cat.displaySpecies();
    }

}