public class Main {
    public static void main(String[] args) {
        // create a rectangle object with specified length and width
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        // create a circle object with specified radius
        Circle circle = new Circle(6.0);
        // calculate the area of the rectangle and store it
        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        // calculate the area of the circle and store it
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);

        // print the results
        System.out.println("The area of the rectangle is: " + areaOfRectangle);
        System.out.println("The area of the circle is: " + areaOfCircle);
    }
}
