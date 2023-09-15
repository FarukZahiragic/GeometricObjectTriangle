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
        String color = input.nextLine();
    }
}

