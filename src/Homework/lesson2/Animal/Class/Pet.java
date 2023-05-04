package Homework.lesson2.Animal.Class;
//1.1 Кличка
//1.2 Порода
//1.3 Наличие прививок
//1.4 Цвет шерсти
//1.5 Дата рождения
//И методами:
//1.5 Проявлять ласку
public abstract class Pet extends Animal {
    private String nickName;
    private String breed;
    private Boolean availabilityOfVaccinations;
    private String coatColor;
    private String dateOfBirth;

    public Pet(String types, Double height, Double weight, String eyeColor, String nickName, String breed, Boolean availabilityOfVaccinations, String coatColor, String dateOfBirth) {
        super(types, height, weight, eyeColor);
        this.nickName = nickName;
        this.breed = breed;
        this.availabilityOfVaccinations = availabilityOfVaccinations;
        this.coatColor = coatColor;
        this.dateOfBirth = dateOfBirth;
    }

    public String getNickName() {
        return nickName;
    }

    public String getBreed() {
        return breed;
    }

    public Boolean getAvailabilityOfVaccinations() {
        return availabilityOfVaccinations;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public abstract void showAffection();



}
