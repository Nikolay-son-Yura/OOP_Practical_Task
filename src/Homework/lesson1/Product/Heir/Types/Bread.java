package Homework.lesson1.Product.Heir.Types;
//7. Хлеб, содержащий следующие свойство:
//7.1 Тип муки

import Homework.lesson1.Product.Heir.Food;

public class Bread extends Food {
    private String flour;

    public Bread(String type, String name, Double price, Integer quantity, String unit, Integer shelfLife, String flour) {
        super(type, name, price, quantity, unit, shelfLife);
        this.flour = flour;
    }

    public String getFlour() {
        return this.flour;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Тип муки: " + flour + ";";
    }
}
