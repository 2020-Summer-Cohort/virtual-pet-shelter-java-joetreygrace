package shelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet petOne = new VirtualPet("Sammy", "A fluffy Norwegian Elkhound/Collie Mix");
        VirtualPet petTwo = new VirtualPet("Zoey", "A Boxer who is Afriad of everything");
        VirtualPet petThree = new VirtualPet("Marshall", "A Golden Retriever who loves going on runs");
        VirtualPetShelter petShelter = new VirtualPetShelter();
        petShelter.addPetToShelter(petOne);
        petShelter.addPetToShelter(petTwo);
        petShelter.addPetToShelter(petThree);
        System.out.println("Welcome to Trey's Pet Shelter\n");
        while (true) {
            System.out.println("This is the status of the pets in the Shelter: \n");
            System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
            System.out.println("--------|-------|-------|-------");
            System.out.println(petShelter.getVirtualPetCollection());
            break;
        }

    }
}
