package Homework.lesson1.Product.Heir.Types;

import Homework.lesson1.Product.Heir.Beverages;

public class Lemonade extends Beverages {

    public Lemonade(String type, String name, Double price, Integer quantity, String unit, Double volume) {
        super(type, name, price, quantity, unit, volume);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
