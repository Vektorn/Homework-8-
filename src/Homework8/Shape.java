package Homework8;

import java.awt.geom.Area;

public abstract class Shape{
    public double getArea(){
        double area=0;
        return area;
    }
    public void printName(){

    }
}
class Circle extends Shape  {
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    private double r;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Circle(double r,String name){
        this.r =r;
        this.name = name;
    }


    public double getArea() {
        double Area;
        Area=r*r*Math.PI;
        return Area;
    }
    public void printName(){
        System.out.println("Фігура = "+name+" площа "+name+" = "+getArea());
    }
}
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Rectangle(double a,double b,String name){
        this.a=a;
        this.b=b;
        this.name=name;
    }

    public double getArea() {
        double Area;
        Area=a*b;
        return Area;
    }
    public void printName(){
        System.out.println("Фігура = "+name+" площа "+name+" = "+getArea());
    }
}
class Square extends Shape{
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    private double a;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Square(double a,String name){
        this.a=a;
        this.name=name;
    }

    public double getArea() {
        double Area;
        Area=a*a;
        return Area;
    }
    public void printName(){
        System.out.println("Фігура = "+name+" площа "+name+" = "+getArea());
    }
}
class equilateralTriangle extends Shape{
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public equilateralTriangle(double a,double h,String name){
        this.a=a;
        this.h=h;
        this.name=name;
    }
    public double getArea() {
        double Area;
        Area=(a*h)/2;
        return Area;
    }
    public void printName(){
        System.out.println("Фігура = "+name+" площа "+name+" = "+getArea());
    }
}
class Cylinder extends Shape  {
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    private double r;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;

    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    private double h;
    public Cylinder(double r,double h,String name){
        this.r =r;
        this.h=h;
        this.name = name;
    }
    public double getArea() {
        double area;
        area=2*Math.PI*r*(r+h);
        return area;
    }
    public void printName(){
        System.out.println("Фігура = "+name+" площа "+name+" = "+getArea());
    }
}