package Homework8;

public class Far {
    public String print (Shape shape){
        switch (shape.getClass().getName()){
            case "Homework8.Circle": return "Коло";
            case "Homework8.Square": return "Квадрат";
            case "Homework8.Rectangle": return "Прямокутник";
            case "Homework8.EquilateralTriangle": return "Рівньосторонній трикутник";
            case "Homework8.Cylinder": return "Циліндр";
        }
        return null;
    }
}
