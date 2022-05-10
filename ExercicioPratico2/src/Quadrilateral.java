public class Quadrilateral {
    public static void area(double side) {
        System.out.println("Square area: " + side * side);
    }

    public static void area(double side1, double side2) {
        System.out.println("Rectangle area: " + side1 * side2);
    }

    public static void area(double smallerBase, double biggerBase, double height) {
        System.out.println("Trapezium area: " + ((smallerBase+biggerBase)*height)/2);
    }
}
