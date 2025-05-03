public class Car {

    /**
     * A class to describe a car, specifying its make, model, year, and price.
     * 
     * @param make the manufacturer of the car, as a string
     * @param model the model of the car, as a string
     * @param year the year that the car was manufactured, as an integer
     * @param price the price of the car, as a double
     */

    private String make, model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Gets the make of the car.
     * 
     * @return the make of the car, as a string
     */

    public String getMake() {
        return this.make;
    }

    /**
     * Gets the model of the car.
     * 
     * @return the model of the car, as a string
     */

    public String getModel() {
        return this.model;
    }

    /**
     * Gets the year of the car.
     * 
     * @return the year of the car, as an integer
     */

    public int getYear() {
        return this.year;
    }
    
    /**
     * Gets the price of the car.
     * 
     * @return the price of the car, as a double
     */

    public double getPrice() {
        return this.price;
    }

    /**
     * Changes the make of the car.
     * 
     * @param s the string that the car's make will be changed to
     */

    public void setMake(String s) {
        this.make = s;
    }

    /**
     * Changes the model of the car.
     * 
     * @param s the string that the car's model will be changed to
     */
    
    public void setModel(String s) {
        this.model = s;
    }

    /**
     * Changes the year of the car.
     * 
     * @param n the integer that the car's year will be changed to
     */

    public void setYear(int n) {
        this.year = n;
    }

    /**
     * Changes the price of the car.
     * 
     * @param d the double that the car's price will be changed to
     */

    public void setPrice(double d) {
        this.price = d;
    }
    
}