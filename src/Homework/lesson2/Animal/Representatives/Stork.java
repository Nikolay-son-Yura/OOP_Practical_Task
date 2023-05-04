package Homework.lesson2.Animal.Representatives;
//2.Аист

import Homework.lesson2.Animal.Class.Bird;

public class Stork extends Bird {

    public Stork(String types, Double height, Double weight, String eyeColor, Double flightAltitude) {

        super(types, height, weight, eyeColor, flightAltitude);
    }

    public void voice() {
        System.out.println("Клац-клац");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Высота полёта: " + getFlightAltitude() + " м";
    }
}
