package Homework.lesson1.Product.Heir;

import Homework.lesson1.Product.Product;

//3. Предметы гигиены, содержащие следующие свойства:
//3.1 Количество штук в упаковке
public class HygieneItems extends Product {
    private Integer piecesPerPack;


    protected HygieneItems(String type, String name, Double price, Integer quantity, String unit, Integer piecesPerPack) {
        super(type, name, price, quantity, unit);
        this.piecesPerPack = piecesPerPack;
    }

    public Integer getPiecesPerPack() {
        return piecesPerPack;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Количество штук в упаковке: " + piecesPerPack + ";";
    }
}
