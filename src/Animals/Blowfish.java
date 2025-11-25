package Animals;

public class Blowfish extends Fish implements AnimalBehavior{
    public int poisonLevel;

    public Blowfish(){}
    public Blowfish(String name, int age, int weight,int size, int poisonLevel) {
        super(name, age, weight, size);
        this.poisonLevel = poisonLevel;
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish sleeps under the stone");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims");
    }
}
