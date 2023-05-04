package Homework.lesson2.Animal.Representatives;
//3.Собака со свойством:
//3.1 Наличие дрессировки(доступным только для чтения внешним классам)
//и методом:
//3.2 Дрессировать

import Homework.lesson2.Animal.Class.Pet;
import Homework.lesson2.Zoo.Interface.Training;

import java.util.Date;

public class Dog extends Pet implements Training {
    private Boolean training;

    public Dog(String types, Double height, Double weight, String eyeColor, String nickName, String breed, Boolean availabilityOfVaccinations, String coatColor, String dateOfBirth, Boolean training) {
        super(types, height, weight, eyeColor, nickName, breed, availabilityOfVaccinations, coatColor, dateOfBirth);
        this.training = training;
    }

    public Dog(String types, Double height, Double weight, String eyeColor, String nickName, String breed, Boolean availabilityOfVaccinations, String coatColor, String dateOfBirth) {
        super(types, height, weight, eyeColor, nickName, breed, availabilityOfVaccinations, coatColor, dateOfBirth);
        this.training = false;
    }

    @Override
    public void training() {
        this.training = true;
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав");
    }

    public void showAffection() {
        System.out.println("Хвост: шмяк-шмяк");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Имя: " + getNickName() +
                "\n Порода: " + getBreed() +
                "\n Вакцинация: " + (getAvailabilityOfVaccinations() ? "есть" : "отсутствует") +
                "\n Окрас: " + getCoatColor() +
                "\n Дата рождения: " + getDateOfBirth() +
                "\n Дрессировка: " + (training ? "есть" : "Дрессировать надо бы");
    }

}