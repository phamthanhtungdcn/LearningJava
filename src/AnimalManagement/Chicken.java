package AnimalManagement;

public class Chicken extends Animal {
    public Chicken(String nome, int age, double canNang) {
        super(nome, age, canNang);
    }

    @Override
    public String tiengKeu() {
        return "Ò ó o !";
    }
}
