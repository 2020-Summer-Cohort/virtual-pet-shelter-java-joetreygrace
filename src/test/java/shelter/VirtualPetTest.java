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
        VirtualPet undertest = new VirtualPet("Sam", "Norwegian Elkhound");
        int thirstLevel = undertest.giveWater(15);
        assertEquals(0, thirstLevel);
    }

    @Test
    public void virtualPetShouldGiveFood() {
        VirtualPet undertest = new VirtualPet("Sam", "Norwegian Elkhound");
        int hungerLevel = undertest.giveFood(25);
        assertEquals(10, hungerLevel);
    }

    @Test
    public void virtualPetShouldPlayWithPet() {
        VirtualPet undertest = new VirtualPet("Sam", "Norwegian Elkhound");
        int boredomLevel = undertest.playWithPet(25);
        assertEquals(0, boredomLevel);
    }

    @Test
    public void tickShouldMakeHungerThirstBoredomGoUp() {
        VirtualPet undertest = new VirtualPet("Sam", "Norwegian Elkhound");
        undertest.tick();
        assertEquals(20,undertest.getHungerLevel());
        assertEquals(20,undertest.getThirstLevel());
        assertEquals(20,undertest.getBoredomLevel());
    }
}
