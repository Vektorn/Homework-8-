package Homework8;

class Circle extends Shape  {
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    private double r;

    public Circle(double r){
        this.r =r;
    }
    public double getArea() {
        double Area;
        Area=r*r*Math.PI;
        return Area;
    }
    public void printName(){
        System.out.println("площа = "+getArea());
    }
}
