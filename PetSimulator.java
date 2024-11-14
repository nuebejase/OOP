import java.util.Scanner;

public class PetSimulator {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        Pet pet = null;

        System.out.println("Welcome to Pet Simulator!");

        while (true) {
            if (pet == null) {
                System.out.print("\nEnter your pet's name: ");
                String name = z.nextLine();

                System.out.println("Choose a pet type:");
                System.out.println("1. Dog\n2. Cat\n3. Bunny\n4. Deer\n5. Hamster");
                int choice = z.nextInt();
                z.nextLine(); 

                switch (choice) {
                    case 1 -> pet = new Dog(name);
                    case 2 -> pet = new Cat(name);
                    case 3 -> pet = new Bunny(name);
                    case 4 -> pet = new Deer(name);
                    case 5 -> pet = new Hamster(name);
                    default -> System.out.println("Invalid choice. Please try again.");
                }

                if (pet != null) {
                    System.out.println("\nYou now have a new pet: " + pet.getName());
                }
            }

            System.out.println("\nChoose an action:");
            System.out.println("1. Feed " + pet.getName());
            System.out.println("2. Play with " + pet.getName());
            System.out.println("3. Make " + pet.getName() + " make a sound");
            if (pet instanceof Dog) System.out.println("4. Play fetch");
            if (pet instanceof Cat) System.out.println("4. Let scratch");
            if (pet instanceof Bunny) System.out.println("4. Hop");
            if (pet instanceof Deer) System.out.println("4. Graze");
            if (pet instanceof Hamster) System.out.println("4. Run in wheel");
            System.out.println("5. Check status");
            System.out.println("6. Choose a new pet");
            System.out.println("7. Exit");

            System.out.print("Choose an action: ");
            int action = z.nextInt();
            z.nextLine(); 

            switch (action) {
                case 1 -> pet.feed();
                case 2 -> pet.play();
                case 3 -> pet.makeSound();
                case 4 -> {
                    if (pet instanceof Dog) ((Dog) pet).fetch();
                    else if (pet instanceof Cat) ((Cat) pet).scratch();
                    else if (pet instanceof Bunny) ((Bunny) pet).hop();
                    else if (pet instanceof Deer) ((Deer) pet).graze();
                    else if (pet instanceof Hamster) ((Hamster) pet).runInWheel();
                }
                case 5 -> System.out.println(pet.getName() + "'s status: Happiness = " + pet.getHappiness() + ", Energy = " + pet.getEnergy());
                case 6 -> {
                    pet = null; 
                    System.out.println("\nTime to choose a new pet!");
                }
                case 7 -> {
                    System.out.println("Thanks for playing Pet Simulator!");
                    return; 
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
