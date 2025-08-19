package AnimalManagement;

public class Cat extends Animal {

    public Cat(String nome, int age, double canNang) {
        super(nome, age, canNang);
    }

    @Override
    public String tiengKeu() {
        return "Meo meo !";
    }
}
