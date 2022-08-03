package Homework8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3) {
            @Override
            void ShowName() {

            }

            @Override
            double Area() {
                return 0;
            }
        };
        System.out.println(circle.printName());
        Cylinder cylinder = new Cylinder(1, 2) {
            @Override
            void ShowName() {

            }

            @Override
            double Area() {
                return 0;
            }
        };
        System.out.println(cylinder.printName());
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5, 6) {
            @Override
            void ShowName() {

            }

            @Override
            double Area() {
                return 0;
            }
        };
        System.out.println(equilateralTriangle.printName());
        Rectangle rectangle = new Rectangle(2, 3) {
            @Override
            void ShowName() {

            }

            @Override
            double Area() {
                return 0;
            }
        };
        System.out.println(rectangle.printName());
        Square square = new Square(4) {
            @Override
            void ShowName() {

            }

            @Override
            double Area() {
                return 0;
            }
        };
        System.out.println(square.printName());
    }
}
