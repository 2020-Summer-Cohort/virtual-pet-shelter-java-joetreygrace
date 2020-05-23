package shelter;

public class VirtualPet {
    private String virtualPetName;
    private String virtualPetDescriptor;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    public VirtualPet(String virtualPetName, String virtualPetDescriptor) {
        this.virtualPetName = virtualPetName;
        this.virtualPetDescriptor = virtualPetDescriptor;
        this.hungerLevel = 15;
        this.thirstLevel = 15;
        this.boredomLevel = 15;
    }

    public String getVirtualPetName() {
        return virtualPetName;
    }

    public String getVirtualPetDescriptor() {
        return virtualPetDescriptor;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int giveWater() {
        thirstLevel = thirstLevel - 15;
        if (thirstLevel < 0) {
            thirstLevel = 0;
        }
        return thirstLevel;
    }

    public int giveFood() {
        hungerLevel = hungerLevel - 15;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
        return hungerLevel;
    }

    public int playWithPet() {
        boredomLevel = boredomLevel - 25;
        if (boredomLevel < 0) {
            boredomLevel = 0;
        }
        return boredomLevel;
    }

    public void tick() {
        hungerLevel = hungerLevel + 5;
        thirstLevel = thirstLevel + 5;
        boredomLevel = boredomLevel + 5;
    }
}
