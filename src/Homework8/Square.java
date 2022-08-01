package Homework8;

class Square extends Shape{
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    private double a;
    public Square(double a){
        this.a=a;
    }
    public double getArea() {
        return a*a;
    }
    public void printName(){
        System.out.println("площа фігури = "+getArea());
    }
}
