package Homework.lesson1.Product.Heir.Types;

import Homework.lesson1.Product.Heir.Food;

//8. Яйца, содержащее следующиее свойство:
//8.1 Количество в упаковке
public class Eggs extends Food {
    private Integer quantityPerPackage;


    public Eggs(String type, String name, Double price, Integer quantity, String unit, Integer shelfLife, Integer quantityPerPackage) {
        super(type, name, price, quantity, unit, shelfLife);
        this.quantityPerPackage = quantityPerPackage;
    }

    public Integer getQuantityPerPackage() {
        return quantityPerPackage;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Количество в упаковке: " + quantityPerPackage + "шт;";
    }
}
