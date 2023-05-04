package Homework.lesson2.Animal.Representatives;
//1.Курица

import Homework.lesson2.Animal.Class.Bird;

public class Chicken extends Bird {

    public Chicken(String types, Double height, Double weight, String eyeColor, Double flightAltitude) {
        super(types, height, weight, eyeColor, flightAltitude);
    }

    @Override
    public void voice() {
        System.out.println("Кудах-ко-ко");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Высота полёта: " + getFlightAltitude() + " м";
    }

}
