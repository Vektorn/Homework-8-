package Homework8;

class Cylinder extends Shape  {
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    private double r;

    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    private double h;
    public Cylinder(double r,double h){
        this.r =r;
        this.h=h;
    }
    public double getArea() {
        return 2*Math.PI*r*(r+h);
    }
    public String printName(){
        return getClass().getSimpleName()+" площа фігури = "+getArea();
    }
}
