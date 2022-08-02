package Homework8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.printName());
        Cylinder cylinder =new Cylinder(1,2);
        System.out.println(cylinder.printName());
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5,6);
        System.out.println(equilateralTriangle.printName());
        Rectangle rectangle =new Rectangle(2,3);
        System.out.println(rectangle.printName());
        Square square =new Square(4);
        System.out.println(square.printName());
    }
}
