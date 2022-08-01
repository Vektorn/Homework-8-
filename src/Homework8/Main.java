package Homework8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.printName();
        System.out.println(new Far().print(circle));
        Cylinder cylinder =new Cylinder(1,2);
        cylinder.printName();
        System.out.println(new Far().print(cylinder));
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5,6);
        equilateralTriangle.printName();
        System.out.println(new Far().print(equilateralTriangle));
        Rectangle rectangle =new Rectangle(2,3);
        rectangle.printName();
        System.out.println(new Far().print(rectangle));
        Square square =new Square(4);
        square.printName();
        System.out.println(new Far().print(square));
    }
}
