package Animals;

import java.io.Serializable;

public abstract class Animal implements AnimalMove{
    public String name;
    public int age;
    public int weight;
    public Animal() {}
    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public abstract void eat();
    public abstract void getVoice();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " age:" + age + " weight:" + weight;
    }
}
