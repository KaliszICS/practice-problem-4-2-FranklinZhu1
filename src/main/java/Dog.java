public class Dog {

    /**
     * A class to describe a dog with a name, breed, and weight.
     * The name and breed are strings while the weight is an integer.
     * 
     * @param name the name of the dog, as a string
     * @param breed the breed of the dog, as a string
     * @param weight the weight of the dog, as a integer
     */

    private String name, breed;
    private int weight;

    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * Gets the name of the dog.
     * 
     * @return the name of the dog, as a string
     */

    public String getName() {
        return this.name;
    }

    /**
     * Gets the breed of the dog.
     * 
     * @return the breed of the dog, as a string
     */
    
    public String getBreed() {
        return this.breed;
    }

    /**
     * Gets the weight of the dog.
     * 
     * @return the weight of the dog, as an integer
     */

    public int getWeight() {
        return this.weight;
    }

    /**
     * Changes the name of the dog.
     * 
     * @param s the string that the dog's name will be changed to
     */

    public void setName(String s) {
        this.name = s;
    }

    /**
     * Changes the breed of the dog.
     * 
     * @param s the string that the dog's breed will be changed to
     */

    public void setBreed(String s) {
        this.breed = s;
    }

    /**
     * Changes the weight of the dog.
     * 
     * @param x the integer that the dog's weight will be changed to
     */

    public void setWeight(int x) {
        this.weight = x;
    }
    
}