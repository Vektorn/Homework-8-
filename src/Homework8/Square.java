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
    public String printName(){
        return getClass().getSimpleName()+" площа фігури = "+getArea();
    }
}
