package Homework8;

class EquilateralTriangle extends Shape{
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
        this.a=a;
        this.h=h;
    }
    public double getArea() {
        double Area;
        Area=(a*h)/2;
        return Area;
    }
    public void printName(){
        System.out.println("Фігура = рівньосторонній трикутник, площа = "+getArea());
    }
}
