package Homework.lesson2.Animal.Class;
//2.1 Место обитания
//2.2 Дата нахождения
public abstract class Wild extends Animal {
    private String habitat;
    private String locationDate;

    public Wild(String types, Double height, Double weight, String eyeColor, String habitat, String locationDate) {
        super(types, height, weight, eyeColor);
        this.habitat = habitat;
        this.locationDate = locationDate;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getLocationDate() {
        return locationDate;
    }

}
