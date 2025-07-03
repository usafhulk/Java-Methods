public class SandwichMaker {

    // Static variable to store ingredients
    static String[] ingredients;

    // Static variable to track if the sandwich is ready
    static boolean sandwichReady;

    // Method 1: Gather Ingredients
    public static void gatherIngredients() {
        // Reserve space for 4 ingredients
        ingredients = new String[4];

        // Populate the array
        ingredients[0] = "bread";
        ingredients[1] = "chicken slices";
        ingredients[2] = "cheese slices";
        ingredients[3] = "lettuce";

        System.out.println("All ingredients arranged.");
    }

    // Method 2: Assemble the sandwich
    public static void assembleSandwich() {
        if (ingredients.length == 4) {
            if (ingredients[0].equals("bread") &&
                ingredients[1].equals("chicken slices") &&
                ingredients[2].equals("cheese slices") &&
                ingredients[3].equals("lettuce")) {
                    
                System.out.println("Assembling the sandwich.");
                sandwichReady = true;
            } else {
                System.out.println("Missing required ingredients.");
            }
        } else {
            System.out.println("Missing required ingredients.");
        }
    }

    // Method 3: Serve the sandwich
    public static void serveSandwich() {
        if (sandwichReady) {
            System.out.println("Serving the sandwich.");
        } else {
            System.out.println("It's taking some time, please wait.");
        }
    }

    // The main method
    public static void main(String[] args) {
        gatherIngredients();   // Call the first method
        assembleSandwich();    // Call the second method
        serveSandwich();       // Call the third method
    }
}
