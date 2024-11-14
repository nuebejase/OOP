public class Bunny extends Pet {
    public Bunny(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: *soft squeak*");
    }

    public void hop() {
        if (energy >= 10) {
            happiness += 7;
            energy -= 10;
            if (happiness > 100) happiness = 100;
            System.out.println(name + " hopped around. Happiness: " + happiness + ", Energy: " + energy);
        } else {
            System.out.println(name + " is too tired to hop.");
        }
    }
}
