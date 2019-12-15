package NUS;

/**
 * @author dinh
 */

import java.util.Scanner;

/**
 * To find the area of the largest circle inscribed
 * inside a square, given the area of the square.
 */
public class TestMath {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter area of a square: ");
        double areaSquare = scanner.nextDouble();

        double radius = Math.sqrt(areaSquare) / 2;
        double areaCircle = Math.PI * Math.pow(radius, 2);

        System.out.printf("Area of circle = %.4f\n", areaCircle);
    }
}

