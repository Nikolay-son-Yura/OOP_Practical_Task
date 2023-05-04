package Homework.lesson2.Animal.Representatives;
//4.Волк со свойством:
//4.1 Вожак стаи(доступным только для чтения внешним классам)

import Homework.lesson2.Animal.Class.Wild;

public class Wolf extends Wild {
    private Boolean leader;

    public Wolf(String types, Double height, Double weight, String eyeColor, String habitat, String locationDate, Boolean leader) {
        super(types, height, weight, eyeColor, habitat, locationDate);
        this.leader = leader;
    }

    public void setLeader(Boolean leader) {
        this.leader = leader;
    }

    @Override
    public void voice() {
        System.out.println("Ауууууу");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Место обитания: " + getHabitat() +
                "\n Дата нахождения: " + getLocationDate() +
                "\n Вожак: " + (leader ? "да" : "нет");
    }
}
