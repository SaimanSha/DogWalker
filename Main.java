public class Main {
    public String grandList;
    public static void main(String[] args) {
        PetOwner owner = new PetOwner("John Doe");
        Pet puppy = new Pet("Rex", owner, false);
        Pet kitty = new Pet("Buddy", owner, true);

        System.out.println(kitty.isACat());
        System.out.println(puppy.isACat());
        System.out.println(owner.getName() + " is a pet owner.");
        System.out.println(kitty.getName() + " is owned by " + kitty.getOwner().getName());
        System.out.println(puppy.getName() + " is owned by " + puppy.getOwner().getName());
        System.out.println(owner.getPortfolio());
    }
}
