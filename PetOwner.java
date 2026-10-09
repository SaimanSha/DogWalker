public class PetOwner {
    private String name;
    private int numberOfPets;
    private int numberOfCats;

    public PetOwner(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfPets() {
        return numberOfPets;
    }
    public int getNumberOfCats() {
        return numberOfCats;
    }
    public void addAPet(boolean cat) {
        numberOfPets++;
        if (cat) {
            numberOfCats++;
        }
    }
    public String getPortfolio() {
        return name + " owns " + numberOfPets + " pets, of which " + numberOfCats + " are cats.";
    }
}