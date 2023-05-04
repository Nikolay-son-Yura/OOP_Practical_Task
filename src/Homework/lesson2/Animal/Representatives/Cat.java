package Homework.lesson2.Animal.Representatives;
//1.Кот со свойством:
//1.1 Наличие шерсти(доступным только для чтения внешним классам)

import Homework.lesson2.Animal.Class.Pet;
import Homework.lesson2.Zoo.Interface.IsWool;

public class Cat extends Pet implements IsWool {

    private Boolean wool;

    public Cat(String types, Double height, Double weight, String eyeColor, String nickName, String breed, Boolean availabilityOfVaccinations, String coatColor, String dateOfBirth, Boolean wool) {
        super(types, height, weight, eyeColor, nickName, breed, availabilityOfVaccinations, coatColor, dateOfBirth);
        this.wool = wool;

    }

    public Cat(String types, Double height, Double weight, String eyeColor, String nickName, String breed, Boolean availabilityOfVaccinations, String coatColor, String dateOfBirth) {
        super(types, height, weight, eyeColor, nickName, breed, availabilityOfVaccinations, coatColor, dateOfBirth);
        this.wool = false;
    }

    @Override
    public void voice() {
        System.out.println("Мррмяу");
    }

    @Override
    public void showAffection() {
        System.out.println("Гладь меня");
    }

    @Override
    public void wool() {
        this.wool = true;
    }

    @Override
    public String toString() {

        return super.toString() + getTypes() + "\n Имя: " + getNickName() +
                "\n Порода: " + getBreed() +
                "\n Порода: " + getBreed() +
                "\n Вакцинация: " + (getAvailabilityOfVaccinations() ? "есть" : "отсутствует") +
                "\n Наличие шерсти: " + (wool ? "есть\n Цвет шерсти: " + getCoatColor() : "отсутствует") +
                "\n Дата рождения: " + getDateOfBirth();
    }
}
