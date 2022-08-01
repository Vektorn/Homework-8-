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
        return r*r*Math.PI;
    }
    public void printName(){
        System.out.println("площа фігури = "+getArea());
    }
}
