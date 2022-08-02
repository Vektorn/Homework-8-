package Homework8;

class Rectangle extends Shape{
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    private double a;
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    private double b;
    public Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double getArea() {
        return a*b;
    }
    public String printName(){
        return getClass().getSimpleName()+" площа фігури = "+getArea();
    }
}
