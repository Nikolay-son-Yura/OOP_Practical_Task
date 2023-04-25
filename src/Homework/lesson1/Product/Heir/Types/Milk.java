package Homework.lesson1.Product.Heir.Types;
//5. Молоко, содержащиее следующее свойство:
//5.1 Процент жирности

import Homework.lesson1.Product.Heir.Beverages;


public class Milk extends Beverages {
    private Double fat;
    private Integer shelfLife;

    public Milk(String type, String name, Double price, Integer quantity, String unit, Double volume, Double fat, Integer shelfLife) {
        super(type, name, price, quantity, unit, volume);
        this.fat = fat;
        this.shelfLife = shelfLife;

    }

    public Integer getShelfLife() {
        return this.shelfLife;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Процент жирности: " + fat + " %;" + "\n Срок годности: " + shelfLife + " суток;";
    }

}
