package Homework.lesson1.Product.Heir;

import Homework.lesson1.Product.Product;

//4.1 Минимальный возраст
//4.2 Гипоаллергенность,
public class ChildensGoods extends Product {
    private Integer minimumAge;
    private String hypoallergenic;

    protected ChildensGoods(String type, String name, Double price, Integer quantity, String unit, Integer minimumAge, String hypoallergenic) {
        super(type, name, price, quantity, unit);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    public Integer getMinimumAge() {
        return minimumAge;
    }

    public String getHypoallergenic() {
        return hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Минимальный возраст: " + minimumAge + " месяцев" + "\n Гипоаллергенность: " + hypoallergenic;
    }
}
