package Homework8;

abstract class EquilateralTriangle extends Shape{

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    private double a;
    public double getH() {
        return h;
    }
    public void setH(double b) {
        this.h = b;
    }
    private double h;
    public EquilateralTriangle(double a,double h){
        name = "Рівносторонній трикутник";
        this.a=a;
        this.h=h;

    }
    public double getArea() {
        return (a*h)/2;
    }
    public String printName(){
        return GetName()+" площа фігури = "+getArea();
    }
}
