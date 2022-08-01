package Homework8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.print(new Far().print(circle)+" :"); circle.printName();
        Cylinder cylinder =new Cylinder(1,2);
        System.out.print(new Far().print(cylinder)+" :");cylinder.printName();
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5,6);
        System.out.print(new Far().print(equilateralTriangle)+" :");equilateralTriangle.printName();
        Rectangle rectangle =new Rectangle(2,3);
        System.out.print(new Far().print(rectangle)+" :");rectangle.printName();
        Square square =new Square(4);
        System.out.print(new Far().print(square)+" :");square.printName();
    }
}
