package Animals;

public class Mammal extends Animal {
    protected int speed;
    public Mammal(){}
    public Mammal(String name, int age, int weight, int speed) {
        super(name, age, weight);
        this.speed = speed;
    }

    @Override
    public void eat() {
        System.out.println(name + " eats meat");
    }

    @Override
    public void getVoice() {
        System.out.println(name + " barks");
    }
}
