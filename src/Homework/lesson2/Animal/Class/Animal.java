package Homework.lesson2.Animal.Class;
//*На языке Java реализовать интерфейс(родительский класс) "Животное" со следующими полями:
//1.Рост животного
//2.Вес животного
//3.Цвет глаз животного
//И методы:
//1.Издать звук
//2.Напечатать информацию о животном
//Так же реализовать следующие интерфейсы(классы наследники), реализующие интерфейс(родительский класс) Животное:
//1.Домашнее животное со следующими свойствами:
//1.1 Кличка
//1.2 Порода
//1.3 Наличие прививок
//1.4 Цвет шерсти
//1.5 Дата рождения
//И методами:
//1.5 Проявлять ласку
//2.Дикое животное со следующими свойствами:
//2.1 Место обитания
//2.2 Дата нахождения
//Реализовать классы следующих животных, реализующих интерфейсы домашнего животного или дикого животного(надеюсь сами поймёте какое животное домашнее, а какое - дикое):
//1.Кот со свойством:
//1.1 Наличие шерсти(доступным только для чтения внешним классам)
//2.1 Тигр
//3.Собака со свойством:
//3.1 Наличие дрессировки(доступным только для чтения внешним классам)
//и методом:
//3.2 Дрессировать
//4.Волк со свойством:
//4.1 Вожак стаи(доступным только для чтения внешним классам)


import Homework.lesson2.Zoo.Interface.IVoice;

public abstract class Animal implements IVoice {
    private String types;
    private Double height;
    private Double weight;
    private String eyeColor;

    public Animal(String types, Double height, Double weight, String eyeColor) {
        this.types = types;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public String getTypes() {
        return types;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public abstract void voice();

    @Override
    public String toString() {
        return getTypes() + "\n Рост: " + getHeight() + " см\n Вес: " + getWeight() + " кг\n Цвет глаз: " + getEyeColor();
    }
}
