package shelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet petOne = new VirtualPet("Sammy", "A fluffy Norwegian Elkhound/Collie Mix");
        VirtualPet petTwo = new VirtualPet("Zoey", "A Boxer who is afraid of everything");
        VirtualPet petThree = new VirtualPet("Rover", "A Golden Retriever who loves going on runs");
        VirtualPetShelter petShelter = new VirtualPetShelter();
        petShelter.addPetToShelter(petOne);
        petShelter.addPetToShelter(petTwo);
        petShelter.addPetToShelter(petThree);
        System.out.println("Welcome to Trey's Pet Shelter\n");
        while (true) {
            System.out.println("This is the status of the pets in the Shelter: \n");
            System.out.println("Name\t\t|Hunger\t\t|Thirst\t\t|Boredom");
            System.out.println("------------|-----------|-----------|---------");
            for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                System.out.println(virtualPet.getVirtualPetName() + "\t\t|" + virtualPet.getHungerLevel() + "\t\t\t|" +
                        virtualPet.getThirstLevel() + "\t\t\t|" + virtualPet.getBoredomLevel());
            }
            System.out.println("\nWhat would you like to do with the pets? \n");
            System.out.println("1. Feed all the pets:");
            System.out.println("2. Give water to all the pets:");
            System.out.println("3. Play with a pet:");
            System.out.println("4. Adopt a pet:");
            System.out.println("5. Admit a pet to the shelter:");
            System.out.println("6. Quit:");
            int userChoice = input.nextInt();
            if (userChoice == 1) {
                petShelter.feedAllPetsAtOnce();
            } else if (userChoice == 2) {
                petShelter.waterAllPetsAtOnce();
            } else if (userChoice == 3) {
                System.out.println("Please type in which pet you'd like to play with?\n");
                System.out.println(petShelter.getVirtualPetCollection());
                String userPetNameChoice = input.next();
                petShelter.playWithASinglePet(userPetNameChoice);
                System.out.println("You played with " + userPetNameChoice);
            } else if (userChoice == 4) {
                System.out.println("\nYou would like to adopt a pet out of the shelter.\nThese are the pets eligible:");
                for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t|" + virtualPet.getVirtualPetDescriptor());
                }
                System.out.println("Please type in which pet to adopt:");
                String userAdoptionChoice = input.next();
                petShelter.removePetFromShelter(petShelter.returnSpecificPetGivenItsName(userAdoptionChoice));
                System.out.println(userAdoptionChoice + " has found a happy home!");
            } else if (userChoice == 5) {
                System.out.println("\nYou would like to add a pet to the Shelter:\nPlease type in the name of the pet:");
                String userPetToAddName = input.next();
                input.nextLine();
                System.out.println("Please type in a description of " + userPetToAddName + ":");
                String userPetToAddDescription = input.nextLine();
                VirtualPet userPetToAdd = new VirtualPet(userPetToAddName,userPetToAddDescription);
                petShelter.addPetToShelter(userPetToAdd);
            } else if (userChoice == 6) {
                System.out.println("\nThanks for helping at the Shelter! Bye!");
                break;
            }
            petShelter.tickForAllPetsAtOnce();
        }
    }
}
