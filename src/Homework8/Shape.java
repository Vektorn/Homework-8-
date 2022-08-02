package Homework8;

import java.awt.geom.Area;

public abstract class Shape{
    public double getArea(){
        double area=0;
        return area;
    }
    public String printName(){

//        Я хотів щоб назва класу замінялась на назву фігури українською , но чомусь воно ігнорується

//        switch (getClass().getSimpleName()){
//            case "Circle": return "Коло";
//            case "Square": return "Квадрат";
//            case "Rectangle": return "Прямокутник";
//            case "EquilateralTriangle": return "Рівньосторонній трикутник";
//            case "Cylinder": return "Циліндр";
//        }
        return printName();
    }
}