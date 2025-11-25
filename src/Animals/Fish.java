package Animals;

public class Fish extends Animal {
    protected int size;

    public Fish(String name, int age, int weight, int size) {
        super(name, age, weight);
        this.size = size;
    }
    public Fish() {}
    @Override
    public void eat() {
        System.out.println(name + " eats algae");
    }

    @Override
    public void getVoice() {
        System.out.println(name + " is quiet");
    }
}
