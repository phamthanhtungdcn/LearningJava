package AnimalManagement;

public class Dog extends Animal {

    public Dog(String nome, int age, double canNang) {
        super(nome, age, canNang);
    }

    @Override
    public String tiengKeu() {
        return "Gâu gâu !";
    }
}
