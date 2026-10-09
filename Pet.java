public class Pet {
    private String name;
    private PetOwner owner;

    public Pet(String name, PetOwner owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public PetOwner getOwner() {
        return owner;
    }
}
