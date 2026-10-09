public class Main {
    public String grandList;
    public static void main(String[] args) {
        
        PetOwner owner = new PetOwner("John Doe");
        Pet pet = new Pet("Buddy", owner);

        System.out.println(pet.getName());
        System.out.println(owner.getName());
        System.out.println(pet.getName() + " is owned by " + pet.getOwner().getName());
    }
}
