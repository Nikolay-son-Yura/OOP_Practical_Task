package Homework.lesson1.Product.Heir;
//1. Продукты питания, содержащие следующие свойства:
//1.1 Срок годности

import Homework.lesson1.Product.Product;

public class Food extends Product {
    private Integer shelfLife;

    protected Food(String type, String name, Double price, Integer quantity, String unit, Integer shelfLife) {
        super(type, name, price, quantity, unit);
        this.shelfLife = shelfLife;
    }

    public Integer getShelfLife() {
        return this.shelfLife;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Срок годности: " + shelfLife + " суток;";
//                String.format("Название: %s; Цена: %d; Количество: %d; Единица измерения: %s; Срок годности: %s", getName(), getPrice(), getQuantity(), getUnit(), bestBeforeDate);
    }
}
