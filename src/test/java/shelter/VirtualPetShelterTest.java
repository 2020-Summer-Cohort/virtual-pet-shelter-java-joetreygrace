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
    public void shouldReturnSpecificPetGivenItsName() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        underTest.addPetToShelter(testPet);
        String test = "Sam";
        assertEquals(testPet,underTest.returnSpecificPetGivenItsName(test));
    }

    @Test
    public void shouldBeAbleToRemoveAPetFromShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        VirtualPet testPet2 = new VirtualPet("Zoey", "Boxer");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        Map<String, VirtualPet> virtualPets = underTest.getVirtualPets();
        assertTrue(virtualPets.containsValue(testPet));
        assertTrue(virtualPets.containsValue(testPet2));
        underTest.removePetFromShelter(testPet2);
        assertFalse(virtualPets.containsValue(testPet2));
    }

    @Test
    public void collectionShouldReturnAllPetsInShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        VirtualPet testPet2 = new VirtualPet("Zoey", "Boxer");
        VirtualPet testPet3 = new VirtualPet("Marshall", "Fluffy dog");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        Collection<VirtualPet> petCollection = underTest.getVirtualPetCollection();
        assertTrue(petCollection.contains("Sam"));
        assertTrue(petCollection.contains("Zoey"));
        assertFalse(petCollection.contains("Marshall"));
    }

    @Test
    public void playWithASinglePetInTheShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        VirtualPet testPet2 = new VirtualPet("Zoey", "Boxer");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.playWithASinglePet("Sam");
        assertEquals(0, testPet.getBoredomLevel());
    }


    @Test
    public void waterShouldWaterAllPetsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        VirtualPet testPet2 = new VirtualPet("Zoey", "Boxer");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.waterAllPetsAtOnce();
        assertEquals(0, testPet2.getThirstLevel());
        assertEquals(0, testPet.getThirstLevel());
    }

    @Test
    public void foodShouldFeedAllPetsInShelterAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        VirtualPet testPet2 = new VirtualPet("Zoey", "Boxer");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.feedAllPetsAtOnce();
        assertEquals(0, testPet.getHungerLevel());
        assertEquals(0, testPet2.getHungerLevel());
    }

    @Test
    public void tickShouldTickForAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Sam", "Norwegian Elkhound");
        VirtualPet testPet2 = new VirtualPet("Zoey", "Boxer");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.tickForAllPetsAtOnce();
        assertEquals(20, testPet.getBoredomLevel());
        assertEquals(20, testPet.getHungerLevel());
        assertEquals(20, testPet.getThirstLevel());
        assertEquals(20, testPet2.getThirstLevel());
        assertEquals(20, testPet2.getHungerLevel());
        assertEquals(20, testPet2.getBoredomLevel());
    }
}
