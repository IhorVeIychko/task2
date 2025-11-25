package Animals;

public class Bird extends Animal {
    protected String featherColor;

    public Bird() {}

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(name + " eats seeds");
    }

    @Override
    public void getVoice() {
        System.out.println(name + " whistles");
    }
}
