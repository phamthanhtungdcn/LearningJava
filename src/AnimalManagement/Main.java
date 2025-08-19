package AnimalManagement;

public class Main {
    public static void main(String[] args) {
        Animal[]  animals = new Animal[3];
        animals[0] = new Dog("Corgi", 3, 10.5);
        animals[1] = new Cat("Kitty", 1, 4.2);
        animals[2] = new Chicken("Trống", 2, 2.5);

        for (Animal animal : animals) {
            System.out.println("Dong vat " + animal.getName() + " keu: " + animal.tiengKeu());
        }
    }
}
