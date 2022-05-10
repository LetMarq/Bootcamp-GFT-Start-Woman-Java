public class QuadrilateralReturn {
    public static double area(double side) {

        return side * side;
    }

    public static double area(double side1, double side2) {

        return side1 * side2;
    }

    public static double area(double smallerBase, double biggerBase, double height) {
        return ((smallerBase + biggerBase) * height)/2;
    }
}
