import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side of triangle: ");
        double side1 = input.nextDouble();

        System.out.print("Enter second side of triangle: ");
        double side2 = input.nextDouble();

        System.out.print("Enter third side of triangle: ");
        double side3 = input.nextDouble();

        System.out.print("Enter color of triangle: ");
        String color = input.next();

        System.out.print("Is the triangle filled? ");
        boolean filled = input.nextBoolean();

        Triangle triangle = null;
        try {
            triangle = new Triangle(side1, side2, side3);
        } catch (IllegalTriangleException e) {
            throw new RuntimeException(e);
        }
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("The area of the created triangle is " + triangle.getArea());
        System.out.println("The perimeter of the created triangle is " + triangle.getPerimeter());
        System.out.println("The color of the created triangle is " + triangle.getColor());
        System.out.println("The created triangle is " + (triangle.isFilled() ? "" : "not") + "filled");

    }
}

