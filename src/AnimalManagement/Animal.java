package AnimalManagement;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double canNang;

    public Animal(String name, int age, double canNang) {
        this.name = name;
        this.age = age;
        this.canNang = canNang;
    }

    public String getName() {
        return name;
    }

    public abstract String tiengKeu();
}
