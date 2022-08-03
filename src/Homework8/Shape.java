package Homework8;

import java.awt.geom.Area;

public abstract class Shape{
        protected String name = ""; // имя фигуры

        protected double area = 0;
        abstract void ShowName();
        abstract double Area();

        String GetName() {
        return name;
    }
}