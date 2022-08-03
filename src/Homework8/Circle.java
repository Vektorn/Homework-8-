package Homework8;

abstract class Circle extends Shape{
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    private double r;

    public Circle(double r){
        name = "Коло";
        this.r =r;
    }
    public double getArea() {
        return r*r*Math.PI;
    }
    public String  printName(){
        return GetName()+" площа фігури = "+getArea();
    }
}
