package Homework.lesson1.Product.Heir;
//2. Напитки, содержащие следующие свойства:
//2.1 Объём

import Homework.lesson1.Product.Product;

public class Beverages extends Product {
    private Double volume;

    protected Beverages(String type, String name, Double price, Integer quantity, String unit, Double volume) {
        super(type, name, price, quantity, unit);
        this.volume = volume;
    }

    public Double getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Объем: " + volume + " литр;";
    }
}
