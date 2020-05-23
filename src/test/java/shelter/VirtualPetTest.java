package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldBeAbleToCreateNewVirtualPet() {
        VirtualPet underTest = new VirtualPet("Sam", "Norwegian Elkhound");
    }

    @Test
    public void shouldRetrieveHungerLevel() {
        VirtualPet underTest = new VirtualPet("Sam", "Norwegian Elkhound");
        assertEquals(15, underTest.getHungerLevel());
    }

    @Test
    public void shouldRetrieveThirstLevel() {
        VirtualPet underTest = new VirtualPet("Sam", "Norwegian Elkhound");
        assertEquals(15, underTest.getThirstLevel());
    }

    @Test
    public void shouldRetrieveBoredomLevel() {
        VirtualPet underTest = new VirtualPet("Sam", "Norwegian Elkhound");
        assertEquals(15, underTest.getBoredomLevel());
    }

    @Test
    public void shouldRetrievePetName() {
        VirtualPet underTest = new VirtualPet("Sam", "Norwegian Elkhound");
        assertEquals("Sam", underTest.getVirtualPetName());
    }

    @Test
    public void shouldRetrievePetDescription() {
        VirtualPet underTest = new VirtualPet("Sam", "Norwegian Elkhound");
        assertEquals("Norwegian Elkhound", underTest.getVirtualPetDescriptor());
    }

    @Test
    public void virtualPetShouldGiveWater() {
        VirtualPet underTest = new VirtualPet("Sam", "Norwegian Elkhound");
        int thirstLevel = underTest.giveWater();
        assertEquals(0, thirstLevel);
    }

    @Test
    public void virtualPetShouldGiveFood() {
        VirtualPet underTest = new VirtualPet("Sam", "Norwegian Elkhound");
        int hungerLevel = underTest.giveFood();
        assertEquals(0, hungerLevel);
    }

    @Test
    public void virtualPetShouldPlayWithPet() {
        VirtualPet underTest = new VirtualPet("Sam", "Norwegian Elkhound");
        int boredomLevel = underTest.playWithPet();
        assertEquals(0, boredomLevel);
    }

    @Test
    public void tickShouldMakeHungerThirstBoredomGoUp() {
        VirtualPet underTest = new VirtualPet("Sam", "Norwegian Elkhound");
        underTest.tick();
        assertEquals(20,underTest.getHungerLevel());
        assertEquals(20,underTest.getThirstLevel());
        assertEquals(20,underTest.getBoredomLevel());
    }
}
