import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Car myFirstCar = new Car();

        myFirstCar.make = "Dogde";
        myFirstCar.model = "Dakota";
        myFirstCar.color = "Red";
        myFirstCar.year = 2001;

        // display the car details for myFirstCar
        myFirstCar.getCarDetails();

        // Array of Car objects
        Car[] cars = new Car[2];
        // Create an object of Scanner Class
        Scanner scanner = new Scanner(System.in);

        // loop through the array of cars
        for (int index = 0; index < 2; index++){
            cars[index] = new Car(); // new object of car at current index
            System.out.println("Enter details for car " + (index + 1));

            // get the user input and assign to 'make' of the car object
            System.out.println("Make: ");
            cars[index].make = scanner.nextLine();

            // model / color / year
            System.out.println("Model: ");
            cars[index].model = scanner.nextLine();

            System.out.println("color: ");
            cars[index].color = scanner.nextLine();

            System.out.println("Year: ");
            // car[index].year = scanner.nextLine(); // parsing the int will behave properly
            cars[index].year = Integer.parseInt(scanner.nextLine());

            // consume the newline character after nextInt()
            // keyBoard.nextLine();
            // removed this undefined and unneeded line
        }

        System.out.println("Your Car Collection");
        for (int index = 0; index < 2; index++){
            String carDetails = cars[index].getCarDetails().toUpperCase();
            System.out.println(carDetails);
        }
    }
}