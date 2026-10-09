public class Pet {
    private String name;
    private PetOwner owner;
    private boolean isACat;

    public Pet(String name, PetOwner owner, boolean isACat) {
        this.name = name;
        this.owner = owner;
        this.isACat = isACat;
        this.owner.addAPet(isACat);
    }

    public String getName() {
        return name;
    }

    public PetOwner getOwner() {
        return owner;
    }

    public String isACat() {
        if (this.isACat == true) {
            return name + " is definetly a cat.";
        } else {
        return name + " is NOT a cat.";
        }
    }
}
