import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO 1: Declare the necessary variables for the car's state and add scanner object
        Scanner scanner = new Scanner(System.in); // setting up the scanner input for the user to interact

        Boolean startCar = false; // is the car started/
        String selectGear = "P"; // string to select gear (P, D, R)
        int accelerate = 0; // Current speed
        int brakes = 0; // subtract from accelerate to apply brakes
        String exit = "Goodbye"; // exit message

        // TODO 2: Display the current state of the car (engine state, gear, speed)
        System.out.println("The car is currently runnng: " + startCar);

        // TODO 3: Add print statements for each variable you want to display or options available to the user
        // 1. Turn on/off the engine
        // 2. Change gear (P, D, R)
        // 3. Accelerate
        // 4. Brake
        // 5. Exit
        System.out.println("Select a number 1 through 5 from the menu below:\n" +
                "1. Turn on/off the engine\n" +
                "2. Change gear (P, D, R)\n" +
                "3. Accelerate\n" +
                "4. Brake\n" +
                "5. Exit");

        // TODO 4: Prompt the user for their choice and store it in the 'choice' variable
        int choice = 0;

        // TODO 5: Implement a switch statement to handle the different menu choices
        while (choice != 5){
            System.out.println("Please make your selection (1-5) from the menu: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    startCar = !startCar; // toggle engine on/off
                    System.out.println("The engine is on: " + (startCar ? "on" : "off"));
                    break;
                case 2:
                    System.out.println("Select gear (P, D, R): ");
                    selectGear = scanner.next().toUpperCase();
                    System.out.println("The gear has now changed to " + selectGear + ".");
                    break;
                case 3:
                    System.out.println("Enter the speed you want to accelerate to: ");
                    accelerate = scanner.nextInt();
                    System.out.println("You have accelerated to " + accelerate + " MPH.");
                    break;
                case 4:
                    System.out.println("Enter the speed you would like to apply the breaks for: ");
                    brakes = scanner.nextInt();
                    brakes = accelerate - brakes;
                    System.out.println("You have slowed to " + brakes + " MPH after applying the brakes");
                    break;
            }
        }

    }
}