public class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: *tiny squeak*");
    }

    public void runInWheel() {
        if (energy >= 5) {
            happiness += 10;
            energy -= 5;
            if (happiness > 100) happiness = 100;
            System.out.println(name + " is running in the wheel. Happiness: " + happiness + ", Energy: " + energy);
        } else {
            System.out.println(name + " is too tired to run.");
        }
    }
}
