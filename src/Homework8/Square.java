package Homework8;

abstract class Square extends Shape{
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    private double a;
    public Square(double a){
        name ="Квадрат";
        this.a=a;
    }
    public double getArea() {
        return a*a;
    }
    public String printName(){
        return GetName()+" площа фігури = "+getArea();
    }
}
