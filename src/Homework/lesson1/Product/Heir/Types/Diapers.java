package Homework.lesson1.Product.Heir.Types;
//11. Подгузники, содержащие следующее свойства:
//11.1 Размер
//11.2 Минимальный вес
//11.3 Максимальный вес
//11.4 Тип

import Homework.lesson1.Product.Heir.ChildensGoods;

public class Diapers extends ChildensGoods {
    private String size;
    private Integer minWeight;
    private Integer maxWeight;
    private String types;

    public Diapers(String type, String name, Double price, Integer quantity, String unit, Integer minimumAge, String hypoallergenic, String size, Integer minWeight, Integer maxWeight, String types) {
        super(type, name, price, quantity, unit, minimumAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.types = types;
    }

    public String getSize() {
        return this.size;
    }

    public Integer getMinWeight() {
        return this.minWeight;
    }

    public Integer getMaxWeight() {
        return this.maxWeight;
    }

    public String getTypes() {
        return this.types;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Размер: " + size + ";" + "\n Минимальный вес:" + minWeight + "грамм;" + "\n Максимальный вес: " + maxWeight + "грамм;" + "\n Тип: " + types + ";";
    }
}
