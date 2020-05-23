package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    private Map<String, VirtualPet> virtualPets = new HashMap<>();


    public Map<String, VirtualPet> getVirtualPets() {
        return virtualPets;
    }

    public Collection getVirtualPetCollection() {
        return virtualPets.values();
    }

    public void addPetToShelter(VirtualPet petToAdd) {
        virtualPets.put(petToAdd.getVirtualPetName(), petToAdd);
    }

    public void removePetFromShelter(VirtualPet petToRemove) {
        virtualPets.remove(petToRemove.getVirtualPetName());
    }

    public void waterAllPetsAtOnce() {
        for (VirtualPet pets : virtualPets.values()) {
            pets.giveWater();
        }
    }

    public void feedAllPetsAtOnce() {
        for (VirtualPet pets : virtualPets.values()) {
            pets.giveFood();
        }
    }

    public void playWithASinglePet(String petName) {
        virtualPets.get(petName).playWithPet();
    }

    public void tickForAllPetsAtOnce() {
        for (VirtualPet pets : virtualPets.values()) {
            pets.tick();
        }
    }
}
