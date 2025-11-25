package Animals;

public class Pigeon extends Bird implements AnimalBehavior{
    private String species;

    public Pigeon() {}
    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon sleeps in the ice tunnel");
    }
    @Override
    public void move() {
        System.out.println("Pigeon moves");
    }
}
