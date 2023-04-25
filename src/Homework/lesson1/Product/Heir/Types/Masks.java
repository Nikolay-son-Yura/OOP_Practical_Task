package Homework.lesson1.Product.Heir.Types;

import Homework.lesson1.Product.Heir.HygieneItems;

public class Masks extends HygieneItems {
    public Masks(String type, String name, Double price, Integer quantity, String unit, Integer piecesPerPack) {
        super(type, name, price, quantity, unit, piecesPerPack);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
