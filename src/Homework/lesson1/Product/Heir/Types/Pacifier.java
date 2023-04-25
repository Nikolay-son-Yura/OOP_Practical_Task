package Homework.lesson1.Product.Heir.Types;

import Homework.lesson1.Product.Heir.ChildensGoods;

public class Pacifier extends ChildensGoods {
    public Pacifier(String type, String name, Double price, Integer quantity, String unit, Integer minimumAge, String hypoallergenic) {
        super(type, name, price, quantity, unit, minimumAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
