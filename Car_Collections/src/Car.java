public class Car {
    String make;
    String model;
    String color;
    int year;

    public String getCarDetails(){
        // build and return a string by adding each car property with label
        // and using new line character \n.
        return "Make: " + make + "\n"
                + "Model: " + model + "\n"
                + "Color: " + color + "\n"
                + "Year: " + year;
    }
}
