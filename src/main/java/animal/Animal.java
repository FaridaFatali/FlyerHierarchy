package animal;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("Animal is eating.");
    }
}
