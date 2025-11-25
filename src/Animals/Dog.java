package Animals;

public class Dog extends Mammal implements AnimalBehavior{
    private String breed;
    public Dog(){}
    public Dog(String name, int age, int weight,int speed, String breed) {
        super(name, age, weight, speed);
        this.breed = breed;
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps on the sofa");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }

    @Override
    public void getVoice() {
        System.out.println("Dog barks");
    }
}
