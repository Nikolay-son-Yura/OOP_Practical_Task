package Homework.lesson2.Animal.Representatives;
//2.1 Тигр

import Homework.lesson2.Animal.Class.Wild;

public class Tiger extends Wild {

    public Tiger(String types, Double height, Double weight, String eyeColor, String habitat, String locationDate) {
        super(types, height, weight, eyeColor, habitat, locationDate);
    }

    public void voice() {
        System.out.println("Ргрывав");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Место обитания " + getHabitat() +
                "\n Дата нахождения: " + getLocationDate();
    }
}
