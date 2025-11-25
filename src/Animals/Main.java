package Animals;

public class Main {
    public static void main(String[] args) {

        Animal[] animalsArray = {
                new Dog("Dox", 2, 21, 30, "Buldog"),
                new Pigeon("Pin", 3, 2, "Grey", "Rare"),
                new Blowfish("Rybka", 4, 1, 2, 3)
        };

        System.out.println("=== MOVEMENT BEHAVIOR ===");
        for (Animal a : animalsArray) {
            a.move();
        }

        System.out.println("\n=== ANIMAL NAMES ===");
        for (Animal a : animalsArray) {
            AnimalName.name(a.getName());
        }

        System.out.println("\n=== SLEEP BEHAVIOR ===");
        AnimalBehavior[] behaviors = {
                (AnimalBehavior) animalsArray[0],
                (AnimalBehavior) animalsArray[1],
                (AnimalBehavior) animalsArray[2]
        };

        for (AnimalBehavior ab : behaviors) {
            ab.sleep();
        }
    }
}
