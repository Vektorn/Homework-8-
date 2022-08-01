package Homework8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.printName();
        Cylinder cylinder =new Cylinder(5,5);
        cylinder.printName();
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5,7);
        equilateralTriangle.printName();
        Rectangle rectangle =new Rectangle(4,5);
        rectangle.printName();
        Square square =new Square(5);
        square.printName();
        System.out.println(new Far().print(circle));
        System.out.println(new Far().print(rectangle));
        System.out.println(new Far().print(equilateralTriangle));
        System.out.println(new Far().print(square));
        System.out.println(new Far().print(cylinder));
    }
}
