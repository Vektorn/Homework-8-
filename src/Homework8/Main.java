package Homework8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Коло");
        circle.printName();
        Cylinder cylinder =new Cylinder(5,5,"Циліндр");
        cylinder.printName();
        equilateralTriangle equilateralTriangle = new equilateralTriangle(5,7,"Рівньосторонній трикутник");
        equilateralTriangle.printName();
        Rectangle rectangle =new Rectangle(4,5,"Прямокутник");
        rectangle.printName();
        Square square =new Square(5,"Квадрат");
        square.printName();
    }
}
