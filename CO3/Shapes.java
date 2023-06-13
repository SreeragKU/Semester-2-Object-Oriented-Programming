/* Create an interface having prototypes of functions area() and perimeter(). Create two
classes Circle and Rectangle which implements the above interface. Create a menu driven
program to find area and perimeter of objects. */

import java.util.*;
interface Shape{
    double area();
    double perimeter();
}
class Circle implements Shape {
    double radius;
    public Circle(double r){
        radius = r;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
class Rectangle implements Shape {
    double length;
    double width;
    public Rectangle(double len, double wid){
        length = len;
        width = wid;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        double per = length + width;
		return 2*per;
    }
}
public class Shapes {
    public static void main(String[] args) {
        Scanner Snr = new Scanner(System.in);
        int choice=0;
		while(choice != 3){
			System.out.println(" ");
			System.out.println(":: AREA AND PERIMETER ::");
			System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = Snr.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = Snr.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area of Circle: " + circle.area());
                    System.out.println("Perimeter of Circle: " + circle.perimeter());
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = Snr.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = Snr.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area of Rectangle: " + rectangle.area());
                    System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid choice!");
            }
		}
    }
}