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

    //for ( VirtualPet pet: pets.values() ) {
//        pet.feed();
//    }
    public void waterAllPetsAtOnce() {
        for (VirtualPet pets : virtualPets.values()) {
            pets.giveWater(pets.getThirstLevel());
        }
    }

//    public void playWithASinglePet(String petName) {
//        virtualPets.get(petName).playWithPet();
//    }
}
