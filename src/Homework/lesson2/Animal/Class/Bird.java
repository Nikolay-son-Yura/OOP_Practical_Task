package Homework.lesson2.Animal.Class;

//Так же реализовать абстрактный класс "Птица", реализующий интерфейс животное, у которого будет защищённое поле:
//1.Высота полёта
//и метод:
//2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
//и защищённый конструктор:
//3.Конструктор принемающий высоту полёта
//И следующие классы-наследники:
//1.Курица
//2.Аист
public abstract class Bird extends Animal {
    private Double flightAltitude;

    public Bird(String types, Double height, Double weight, String eyeColor, Double flightAltitude) {
        super(types, height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }

    public Double getFlightAltitude() {
        return flightAltitude;
    }
}
