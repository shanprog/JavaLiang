package ch02.home;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1, y1, x2, y2, x3, y3;

        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        x3 = in.nextDouble();
        y3 = in.nextDouble();

        double side1 = Math.pow((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))), 0.5);
        double side2 = Math.pow((Math.pow(x3 - x2, 2) + (Math.pow(y3 - y2, 2))), 0.5);
        double side3 = Math.pow((Math.pow(x1 - x3, 2) + (Math.pow(y1 - y3, 2))), 0.5);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle is " + area);
    }
}
