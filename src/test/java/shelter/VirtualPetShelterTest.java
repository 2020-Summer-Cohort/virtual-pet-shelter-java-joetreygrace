package shelter;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {
    @Test
    public void virtualPetShelterShouldExist() {
        VirtualPetShelter underTest = new VirtualPetShelter();
    }

    @Test
    public void shouldBeAbleToAddAPetToShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        underTest.addPetToShelter(testPet);
        Map<String, VirtualPet> virtualPets = underTest.getVirtualPets();
        assertTrue(virtualPets.containsValue(testPet));
    }

    @Test
    public void shouldBeAbleToRemoveAPetFromShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        VirtualPet testPet2 = new VirtualPet("Zoey", "Boxer");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        Map<String,VirtualPet> virtualPets= underTest.getVirtualPets();
        assertTrue(virtualPets.containsValue(testPet));
        assertTrue(virtualPets.containsValue(testPet2));
        underTest.removePetFromShelter(testPet2);
        assertFalse(virtualPets.containsValue(testPet2));
    }
//
//    @Test
//    public void shouldReturnSpecificPetGivenItsName() {
//        VirtualPetShelter underTest = new VirtualPetShelter();
//
//    }

    @Test
    public void collectionShouldReturnAllPetsInShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        VirtualPet testPet2 = new VirtualPet("Zoey", "Boxer");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        Collection<VirtualPet> petCollection = underTest.getVirtualPetCollection();
        assertTrue(petCollection.contains(testPet));
        assertTrue(petCollection.contains(testPet2));
    }
//
//    @Test
//    public void playWithASinglePetInTheShelter(){
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
//        VirtualPet testPet2 = new VirtualPet("Zoey", "Boxer");
//        underTest.addPetToShelter(testPet);
//        underTest.addPetToShelter(testPet2);
//        underTest.playWithASinglePet(testPet.getVirtualPetName());
//
//    }


    @Test
    public void waterAllPetsAtOnce(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        VirtualPet testPet2 = new VirtualPet("Zoey", "Boxer");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.waterAllPetsAtOnce();
        assertEquals(0,testPet2.getThirstLevel());
    }
}
