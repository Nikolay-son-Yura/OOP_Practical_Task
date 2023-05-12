package Homework.lesson3.Heir;

import Homework.lesson3.Parent.Figure;
import Homework.lesson3.Parent.Polygon;

import java.util.Objects;

public class Square extends Polygon {
    public Square(String name, Double a) {
        super(name, 4, new Double[]{a, a, a, a});
    }


    @Override
    public Double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    public Double getPeremetr() {
        return super.getPeremetr();
    }

    @Override
    public String toString() {
        return super.toString() + "\n Стороны : " + sides[0] +
                "\n Периметр: " + getPeremetr() +
                "\n Площадь: " + getArea();
    }

    @Override
    public int compareTo(Figure o) {
        return this.getArea().compareTo(o.getArea());
    }
}
